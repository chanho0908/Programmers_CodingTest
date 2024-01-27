class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        int condition = k % 2;
        for(int i=0; i<arr.length; i++){
            if(condition != 0) answer[i] = arr[i]*k;
            else answer[i] += arr[i]+k;
        }
        return answer;
    }
}