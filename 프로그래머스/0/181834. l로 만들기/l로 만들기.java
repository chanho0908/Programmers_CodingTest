class Solution {
    public String solution(String myString) {
        String answer = "";
        char l = 'l';
        for(char x : myString.toCharArray()){
            if(x < l) answer += l;
            else answer+=x;
        }
        return answer;
    }
}