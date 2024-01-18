import java.util.*;
import java.util.stream.*;
class Solution {
    public List solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        for(int i=l; i<=r; i++){
            if(i % 5 == 0){
                List<Character> arr = String.valueOf(i).chars()
                    .mapToObj(c -> (char) c).collect(Collectors.toList());
                
                boolean flag = arr.stream().anyMatch(x -> x != '0' && x != '5');

                if(!flag) answer.add(i);
            }
        }
        
        if(answer.size() == 0) answer.add(-1);
        return answer;
    }
}