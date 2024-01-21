class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        for(int i=0; i<= my_string.length() - target.length(); i++){
            int cnt = 0;
            for(int j=0; j < target.length(); j++){
                if(my_string.charAt(i+j) == target.charAt(j)) cnt++;
            }
            if(cnt == target.length()) answer = 1;
        }
        return answer;
    }
}