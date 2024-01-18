import java.util.*;

class Solution {
    public List solution(int[] arr, int[] query) {
        List<Integer> answer = new ArrayList<>();
        for(int x:arr)answer.add(x);
        
        for(int i=0; i < query.length; i++){
            if(i % 2 == 0){   
                for(int j=answer.size()-1; j > query[i]; j--) 
                answer.remove(j);
            }
            
            if(i % 2 != 0){
                for(int j=query[i]-1; j >= 0; j--) 
                    answer.remove(j);
            }
            
        }
        
        return answer;
    }
}