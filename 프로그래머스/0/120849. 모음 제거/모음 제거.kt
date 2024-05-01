class Solution {
    fun solution(my_string: String): String {
        val list = listOf("a", "e", "i", "o", "u")
        return my_string.filter { !list.contains(it.toString()) || 
            it.toString().isEmpty() 
        }
    }
}