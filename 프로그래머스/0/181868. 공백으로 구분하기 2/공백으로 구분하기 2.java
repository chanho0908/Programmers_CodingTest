import java.util.*;

class Solution {
    public ArrayList<String> solution(String my_string) {
        String[] spt = my_string.split(" ");
        ArrayList<String> answer = new ArrayList<>();
        int k=0;
        for(int i=0; i < spt.length; i++){
            if(!spt[i].isEmpty()) answer.add(spt[i]);
        }
        
        
        return answer;
    }
}