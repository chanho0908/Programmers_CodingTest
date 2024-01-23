import java.util.*;
class Solution {
    public ArrayList solution(int n, int[] numlist) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int x : numlist){
            if(x % n == 0) arr.add(x);
        }
        return arr;
    }
}