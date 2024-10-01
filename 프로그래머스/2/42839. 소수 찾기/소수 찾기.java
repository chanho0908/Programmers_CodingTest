import java.util.*;

class Solution {
    Set<Integer> primeSet = new HashSet<>();

    public int solution(String numbers) {
        this.makeWord("", numbers);
        return primeSet.size();
    }

    void makeWord(String word, String others){
        if(!word.equals("")){
            int n = Integer.parseInt(word);
            if(isPrime(n)) primeSet.add(n);
        }

        for(int i = 0; i < others.length(); i++){
            makeWord(word + others.charAt(i), others.substring(0, i) + others.substring(i+1));
        }
    }

    Boolean isPrime(int n){
        if(n < 2) return false;
        int limit = (int) Math.sqrt(n);
        for(int i=2; i <= limit; i++)
            if(n % i == 0) return false;
        return true;
    }
}