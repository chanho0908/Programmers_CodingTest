import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Integer[] arr = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<emergency.length; j++){
                if(emergency[i] == arr[j]) answer[i] = j+1;
            }
        }
        return answer;
    }
}