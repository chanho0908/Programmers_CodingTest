class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        
        for(char x:my_string.toCharArray()){
            if(x!= 'i' && x!= 'o' && x!= 'u' && x!= 'a'&& x!= 'e') 
                answer += x;
        }
        return answer;
    }
}