class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        for(int i=0; i <= str2.length() - str1.length(); i++){
            boolean find = true;
            for(int j=0; j < str1.length(); j++){
                if(str2.charAt(i+j) != str1.charAt(j)){
                    find = false;
                    
                }
            }
            if(find) return 1;
        }
        return 0;
    }
}