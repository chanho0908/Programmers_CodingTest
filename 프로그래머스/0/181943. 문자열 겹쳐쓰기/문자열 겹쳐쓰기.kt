class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer: String = ""
        val len = overwrite_string.length

        var x = 0;
        my_string.toCharArray().forEachIndexed { index, c ->
            answer += if (index >= s && x < len) overwrite_string[x++]
            else c

        }

        return answer
    }
}