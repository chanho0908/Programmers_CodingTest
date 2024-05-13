class Solution {
    fun solution(numbers: IntArray): Int = 
     numbers.maxOrNull()?.times(numbers.sorted()[numbers.size - 2]) ?: 0
    
}