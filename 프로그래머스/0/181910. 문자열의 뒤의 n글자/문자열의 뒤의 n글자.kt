class Solution {
    fun solution(my_string: String, n: Int): String {
          return my_string.toCharArray().takeLast(n).joinToString("")
    }
}