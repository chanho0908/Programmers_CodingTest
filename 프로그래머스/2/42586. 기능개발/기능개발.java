import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> workDays = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int cnt = 0;
            while (progresses[i] < 100) {
                progresses[i] += speeds[i];
                cnt++;
            }
            workDays.add(cnt);
        }

        int lt = 0;
        int rt = 0;
        int works = 1;
        while (lt != workDays.size() - 1) {
            if (workDays.get(rt) >= workDays.get(lt + 1)) {
                works++;
            } else {
                answer.add(works);
                rt = lt + 1;
                works = 1;
            }
            lt++;
        }
        answer.add(works);
        return answer;
    }
}