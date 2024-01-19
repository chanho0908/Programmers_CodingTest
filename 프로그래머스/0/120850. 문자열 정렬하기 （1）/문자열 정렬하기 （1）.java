import java.util.*;
class Solution {
    public List solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        for(char x : my_string.toCharArray()){
            if(Character.isDigit(x)) answer.add((int) x - '0');
        }
        
        Collections.sort(answer);
        return answer;
    }
}