import java.util.*;
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arr1S = Arrays.stream(arr1).sum();
        int arr2S = Arrays.stream(arr2).sum();
        
        if(arr1.length != arr2.length){
            answer = arr1.length > arr2.length ? 1 : -1;
        }else{
            if(arr1S == arr2S) answer = 0;
            else if(arr1S > arr2S) answer = 1;
            else if(arr1S < arr2S) answer = -1;
        }
        return answer;
    }
}