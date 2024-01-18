import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        String[] arr = myString.split("x");
        int cnt = 0;
        for(String x:arr) if(!x.isEmpty()) cnt++;
        answer = new String[cnt];
        int j=0;
        for(String y : arr) if(!y.isEmpty()) answer[j++] = y;
        
        Arrays.sort(answer);
        return answer;
    }
}