class Solution {
    fun solution(n: Int): Int = "$n".map{ it.digitToInt() }.sum()
}