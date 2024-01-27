class Solution {
    public String solution(String myString) {
        String answer = "";
        for(char x:myString.toCharArray()){
            answer += String.valueOf(Character.toLowerCase(x));
        }
        return answer;
    }
}