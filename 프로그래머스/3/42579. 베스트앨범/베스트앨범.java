import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {

        // 1. 장르별 총 재생 횟수를 저장하는 맵
        Map<String, Integer> genrePlayCount = new HashMap<>();

        // 2. 장르별로 (노래 인덱스, 재생 횟수)를 저장하는 맵
        Map<String, List<int[]>> genreSongs = new HashMap<>();

        for (int i = 0; i < genres.length; i++){
            String genre = genres[i];
            int play = plays[i];

            // 장르별 총 재생 횟수 계산
            genrePlayCount.put(genre, genrePlayCount.getOrDefault(genre, 0) + play);

            genreSongs.putIfAbsent(genre, new ArrayList<>());
            genreSongs.get(genre).add(new int[]{i, play});
        }

        // 2. 장르별 재생 횟수를 기준으로 내림차순 정렬
        List<String> sortedGenres = new ArrayList<>(genrePlayCount.keySet());
        sortedGenres.sort((a, b) -> genrePlayCount.get(b).compareTo(genrePlayCount.get(a)));

        // 결과를 저장할 리스트
        List<Integer> result = new ArrayList<>();
        for (String genre : sortedGenres) {
            List<int[]> songs = genreSongs.get(genre);

            songs.sort((a, b) -> {
                if (b[1] == a[1]){
                    return a[0] - b[0];
                }
                return b[1] - a[1];
            });

            for (int i = 0; i < Math.min(2, songs.size()); i++) {
                result.add(songs.get(i)[0]);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}