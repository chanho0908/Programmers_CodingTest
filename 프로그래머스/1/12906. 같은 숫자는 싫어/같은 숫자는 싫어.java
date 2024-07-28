import java.util.*;

public class Solution {
     public List<Integer> solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
         
        for(int i = 1; i<arr.length; i++){
            if (st.peek() != arr[i]){
                st.push(arr[i]);
            }
        }
        for (Integer s : st) answer.add(s);
        return answer;
    }
}