class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        int len = (intervals[0][1] - intervals[0][0] +1) + 
            (intervals[1][1] - intervals[1][0] +1);
        
        answer = new int[len];
        int k=0;
        for(int i=intervals[0][0]; i <= intervals[0][1]; i++){
            answer[k++] = arr[i];
        }
        
        for(int i=intervals[1][0]; i <= intervals[1][1]; i++){
            answer[k++] = arr[i];
        }
        
        return answer;
    }
}