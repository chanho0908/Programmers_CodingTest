
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int cnt = 0;
        for(boolean x : finished) if(x==false) cnt++;
        String[] answer = new String[cnt];
        int j=0;
        for(int i=0; i<todo_list.length; i++){
            if(finished[i] == false) answer[j++] = todo_list[i];
        }
        return answer;
    }
}