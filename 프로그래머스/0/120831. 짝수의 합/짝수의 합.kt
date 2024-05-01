class Solution {
    fun solution(n: Int) = (0..n).filter { it % 2 == 0 }.sum()
}