class Solution {
    public int solution(String number) {
        int sum = 0;
        for(char x : number.toCharArray()) sum+= Character.getNumericValue(x);
        
        return sum%9;
    }
}