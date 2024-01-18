import java.util.*;

class Solution {
    public List solution(String[] str_list) {
        List<String> answer = new ArrayList<>();
        String str = "";
        for(String x : str_list) str +=x;
            
        for(String x : str_list){
            if(x.equals("l")){
                for(int i = 0; i<str.indexOf(x); i++){
                    answer.add(str_list[i]);
                }
                break;
            }if(x.equals("r")){
                for(int i = str.indexOf(x)+1; i < str_list.length; i++){
                    answer.add(str_list[i]);
                }
                break;
            }
        }
        return answer;
    }
}