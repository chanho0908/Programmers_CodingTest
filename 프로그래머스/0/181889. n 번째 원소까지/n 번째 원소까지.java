class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        if(n==1) answer[0] = num_list[0];
        else{
            for(int i=0; i<n; i++) answer[i] = num_list[i];
        }
        return answer;
    }
}