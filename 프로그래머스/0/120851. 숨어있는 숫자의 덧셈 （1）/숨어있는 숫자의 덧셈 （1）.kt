class Solution {
    fun solution(my_string: String): Int = my_string.filter{ it.isDigit() }.map{it.digitToInt()}.sum()
}