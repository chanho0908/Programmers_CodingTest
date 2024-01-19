import java.math.*;
class Solution {
    public int solution(int[] box, int n) {
        int a = (int) Math.floor(box[0] / n); 
        int b = (int) Math.floor(box[1] / n); 
        int c = (int) Math.floor(box[2] / n); 
        return a*b*c;
    }
}