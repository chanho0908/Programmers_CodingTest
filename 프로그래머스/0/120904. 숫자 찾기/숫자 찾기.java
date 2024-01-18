class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        char[] arr = String.valueOf(num).toCharArray();
        for(int i=0; i < arr.length; i++){
            if( (int) arr[i] - '0' == k) return i+1;
        }
        return answer;
    }
}