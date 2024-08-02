class Solution {
    fun solution(citations: IntArray): Int {
        val arr = citations.toMutableList().sortedDescending()
        for(i in arr.indices){
            if(i >= arr[i]) return i
        }
        return arr.size
    }
}