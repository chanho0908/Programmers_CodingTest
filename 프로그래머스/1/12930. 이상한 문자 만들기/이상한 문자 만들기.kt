class Solution {
    fun solution(s: String): String = s.split(" ").map {
        it.mapIndexed { i, v ->
            if (i % 2 == 0) v.uppercaseChar()
            else v.lowercaseChar()
        }.joinToString("")
    }.joinToString(" ")
}