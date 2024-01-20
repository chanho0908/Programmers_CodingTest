import java.util.*;
class Solution {
    public List solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        for(String x : strArr){
            if(!x.contains("ad")) answer.add(x); 
        } 
        
        return answer;
    }
}