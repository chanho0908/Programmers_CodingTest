class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        
        for(int i =0; i<arr.length; i++){
            int target = arr[i];
            if(target >= 50 && target % 2 == 0) answer[i] = target/2;
            else if(target < 50 && target % 2 != 0) answer[i] = target*2;
            else answer[i] = target;
        }
        return answer;
    }
}