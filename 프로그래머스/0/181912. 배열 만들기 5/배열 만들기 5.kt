class Solution {
    fun solution(arr: Array<String>, k: Int, s: Int, l: Int): LongArray{
      return arr.map { (it.substring(s until s+l).toLong()) }.filter{ it > k }.toLongArray()
    }
}