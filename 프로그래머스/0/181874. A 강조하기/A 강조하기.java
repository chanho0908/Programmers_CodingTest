class Solution {
    public String solution(String myString) {
        String answer = "";
        for(char x:myString.toCharArray()){
            if(x=='a') answer += "A";
            else if(x != 'A' && Character.isUpperCase(x)) 
                answer += Character.toLowerCase(x);
            else answer += x;
        }
            
            
        return answer;
    }
}