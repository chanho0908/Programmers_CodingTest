import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] tmpArr = Arrays.copyOf(num_list, len);
        int[] answer = new int[len+1];
        
        int max = tmpArr[len-1];
        int subMax = tmpArr[len-2];
        
        for(int i=0; i<len; i++){
            answer[i] = tmpArr[i];
        }
        if(max > subMax) answer[answer.length-1] = max - subMax;
        else answer[answer.length-1] = max *=2;
        
        return answer;
    }
}