class Solution {
    fun solution(s: String): Boolean = if ((s.length == 4) or (s.length == 6)
        and (s.toIntOrNull() is Int)
    ) {
        true
    } else {
        false
    }
}