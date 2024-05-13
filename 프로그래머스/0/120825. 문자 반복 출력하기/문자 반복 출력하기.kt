class Solution {
    fun solution(my_string: String, n: Int): String {
        val sb = StringBuilder("")
        for(c in my_string){ repeat(n){ sb.append(c) } }
        return sb.toString()
    }
}