class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for(int i=0; i<code.length(); i++){
            String target = String.valueOf(code.charAt(i));
            
            if(target.equals("1")){
                if(mode == 0) mode = 1;
                else mode = 0;
            }else{
                if(mode == 0 && i % 2 == 0){
                    answer += target;
                }else if(mode == 1 && i % 2 != 0){
                    answer += target;
                }
            }
        }
        
        if (answer.equals("")) answer = "EMPTY";
        return answer;
    }
}