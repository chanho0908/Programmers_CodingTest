import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;    
        int max = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
        }
        
        for(int key : map.keySet()){
           //if(max < map.get(key)) answer = map.get(key);
           if(max < map.get(key)){
             max = map.get(key);
             answer = key;
           } 
        }
        
        int cnt = 0;
        for(int key : map.keySet()){
            if(map.get(answer) == map.get(key)) cnt++;
        }
        
        if(cnt > 1) answer = -1;
        
        return answer;
    }
}