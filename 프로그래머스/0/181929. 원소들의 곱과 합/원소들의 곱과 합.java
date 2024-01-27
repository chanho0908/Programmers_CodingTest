import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int pow = (int) Math.pow(Arrays.stream(num_list).sum(), 2);
        int mul = Arrays.stream(num_list).reduce(1, (x, y) -> x*y);
        
        if(mul < pow) answer = 1;
        return answer;
    }
}