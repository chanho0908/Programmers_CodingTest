import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        if (Arrays.stream(scoville).filter(it -> it >= K ).count() == scoville.length) return 0;

        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        for (Integer s : scoville) pQ.offer(s);

        while (!pQ.isEmpty()){
            int x = pQ.poll();
            if (x >= K) break;
            else if(!pQ.isEmpty()) {
                pQ.offer(x + pQ.poll() * 2);
                answer++;
            }
            if (pQ.size() == 1 && pQ.peek() < K) return -1;
        }
        return answer;
    }
}
