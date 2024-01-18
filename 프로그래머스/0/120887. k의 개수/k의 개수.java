class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int z=i; z <= j; z++){
            String target = String.valueOf(z);
            for(char x:target.toCharArray()) 
                if( (int) x - '0' == k) answer++;
        }
        return answer;
    }
}