class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(String x:str_list){
            if(x.contains(ex)) answer += ex.replace(ex, "");
            else answer += x;
        }
        return answer;
    }
}