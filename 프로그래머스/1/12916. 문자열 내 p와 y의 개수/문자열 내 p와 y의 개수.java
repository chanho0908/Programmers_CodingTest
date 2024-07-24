class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String str = s.toLowerCase();
        int x = 0;

        for(char c : str.toCharArray()){
            if(c == 'p') x++;
            else if(c == 'y') x--;
        }
            System.out.println(x);

        if(x == 0) answer = true;
        else if(!str.contains("p") && !str.contains("y")) answer = true;
        else answer = false;
        return answer;
    }
}