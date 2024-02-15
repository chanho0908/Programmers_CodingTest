class Solution {
    fun solution(array: IntArray): Int {
        array.sort()
        val s = array

        return if (s.size % 2 == 0) s[array.size / 2 -1] else s[array.size / 2]

    }
}