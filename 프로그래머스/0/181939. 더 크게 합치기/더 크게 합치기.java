class Solution {
    public int solution(int a, int b) {
        
        int x = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int y = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        
        if(x >= y) return x;
        else return y;
    }
}