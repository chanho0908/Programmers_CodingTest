import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        
        int i = 0;
        while(set.size() != nums.length/2 && i < nums.length){
            int key = nums[i++];
            if (map.get(key) != 0){
                set.add(key);
                map.put(key, map.get(key) -1);
            }
        }

        return set.size();
    }
}

