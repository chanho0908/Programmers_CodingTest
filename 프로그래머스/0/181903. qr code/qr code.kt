class Solution {
    fun solution(q: Int, r: Int, code: String): String {
        return return code.filterIndexed { idx, code ->
        (idx % q) == r
        }
    }
}