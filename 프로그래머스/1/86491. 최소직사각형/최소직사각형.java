import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;

        for(int[] arr : sizes){
            int[] sortedArr = Arrays.stream(arr).sorted().toArray();
            maxH = Math.max(maxH, sortedArr[0]);
            maxW = Math.max(maxW, sortedArr[1]);
        }

        return maxH * maxW;
    }
}