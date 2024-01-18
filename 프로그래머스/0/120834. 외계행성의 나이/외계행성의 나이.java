class Solution {
    public String solution(int age) {
        String answer = "";
        char[] arr = String.valueOf(age).toCharArray();
        char[] alpabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        
        for(int i=0; i < arr.length; i++){
            for(int j=0; j < alpabets.length; j++){
                if((int) arr[i] - '0' == j) answer += alpabets[j];    
            }
            
        }
        return answer;
    }
}