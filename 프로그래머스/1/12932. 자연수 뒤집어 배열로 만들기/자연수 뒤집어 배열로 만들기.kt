class Solution {
  fun solution(n: Long): IntArray = n.toString().reversed().map{ it.toInt() - '0'.toInt() }.toIntArray()
}