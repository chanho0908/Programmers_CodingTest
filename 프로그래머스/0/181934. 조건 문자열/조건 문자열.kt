class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        val answer = 0
        if (ineq == ">" && eq == "=") return if (n >= m) 1 else 0
        if (ineq == "<" && eq == "=") return if (n <= m) 1 else 0
        if (ineq == ">" && eq == "!") return if (n > m) 1 else 0
        return if (ineq == "<" && eq == "!") if (n < m) 1 else 0 else answer
    }
}