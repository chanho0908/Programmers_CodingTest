import java.util.*;
import java.math.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(String x : strArr){
            map.put(x.length(), map.getOrDefault(x.length(), 0) + 1);
        }
        
        int max = Integer.MIN_VALUE;
        
        for(int x : map.keySet()){
            max = Math.max(max, map.get(x));
        }
        
        return max;
    }
}