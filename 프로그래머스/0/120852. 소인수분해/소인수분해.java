import java.util.*;
class Solution {
    public List getPrime(int n){
        int[] arr = new int[n+1];
        List<Integer> answer = new ArrayList<>();
        
        for(int i=2; i <= n; i++){
            if(arr[i] == 0){
                if(n % i == 0 ) answer.add(i);
                for(int j=i; j <= n; j+=i) arr[j] = 1;    
            }
        }
        return answer;
    }
    
    
    public List solution(int n) {
        return getPrime(n);
    }
}