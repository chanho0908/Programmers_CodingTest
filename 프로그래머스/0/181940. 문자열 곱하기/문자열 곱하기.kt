class Solution {
    fun solution(my_string: String, k: Int): String {
        val sb = StringBuilder()
        repeat(k){ sb.append(my_string) }
        return sb.toString()
    }
}