import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int len = num_list.length;
        int mul=1;
        if(len >= 11) 
            return Arrays.stream(num_list).sum();
        else{ 
            for(int x : num_list) mul *= x;
            answer = mul;
        }
         
        return answer;
    }
}