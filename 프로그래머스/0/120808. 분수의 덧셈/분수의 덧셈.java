import java.util.*;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int denom = denom1 * denom2; // 분모
        int number = (numer1 * denom2) + (numer2 * denom1); // 분자
        
        int least = Math.min(denom, number);
        
        while(denom % least != 0 || number % least != 0){
            least--;
        }

        answer[0] = number / least;
        answer[1] = denom / least;
        
        
        
        return answer;
    }
}