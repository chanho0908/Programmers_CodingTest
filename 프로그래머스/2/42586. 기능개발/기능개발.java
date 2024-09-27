import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();

        int i = 0;  // 작업 인덱스
        while (i < progresses.length) {
            // 매일 작업의 진행도를 업데이트
            for (int j = 0; j < progresses.length; j++) {
                progresses[j] += speeds[j];  // 각 작업의 진행도 업데이트
            }

            // 배포할 수 있는 작업이 있는지 확인
            int cnt = 0;
            while (i < progresses.length && progresses[i] >= 100) {
                cnt++;
                i++;
            }

            if (cnt > 0) {
                answer.add(cnt);  // 한번에 배포된 작업 수 추가
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}