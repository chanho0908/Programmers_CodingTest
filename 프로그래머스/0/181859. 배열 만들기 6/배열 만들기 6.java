import java.util.*;
class Solution {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i < arr.length; i++){
            if(st.isEmpty()) st.push(arr[i]);
            else if(!st.isEmpty() && st.peek() == arr[i]) st.pop();
            else if(!st.isEmpty() && st.peek() != arr[i]) st.push(arr[i]);
        }
        
        if(st.isEmpty()) st.push(-1);
        return st;
    }
}