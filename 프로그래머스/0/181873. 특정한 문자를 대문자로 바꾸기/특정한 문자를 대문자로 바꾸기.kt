class Solution {
    fun solution(my_string: String, alp: String) = my_string.map {
            if (it == alp[0]) {
                it.toUpperCase()
            }else {
                it
            }
        }.joinToString("")
}