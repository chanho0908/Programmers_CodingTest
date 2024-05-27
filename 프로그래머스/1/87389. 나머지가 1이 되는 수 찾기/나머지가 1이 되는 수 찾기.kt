class Solution {
    fun solution(n: Int): Int = (2..n).first{ n % it == 1}
    
}