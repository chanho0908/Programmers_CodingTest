class Solution {
  fun solution(n: Long): IntArray = n.toString().reversed().map{ it.digitToInt() }.toIntArray()
}