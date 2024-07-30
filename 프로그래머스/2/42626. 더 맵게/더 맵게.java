import java.util.*;

class Solution {
    public int mix(int x, int y){
        return x + y *2;
    }
    
    public int solution(int[] scoville, int K) {
        int answer = 0;
        if(Arrays.stream(scoville).filter(it -> it >= K).count() == scoville.length) return answer;
        
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for (Integer s : scoville) q.offer(s);
        while(true){
            if (!q.isEmpty()){
                int x = q.poll();
                if (x >= K) break;
                else{
                    if (!q.isEmpty()) q.offer(mix(x, q.poll()));
                }
                answer++;
            }
            if(q.size() == 1 && q.peek() < K) return -1;
            
        }

        return answer;
    }
}