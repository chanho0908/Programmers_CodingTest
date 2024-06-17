class Solution {
    fun solution(my_string: String, is_prefix: String): Int {
        var answer: Int = 0
        my_string.forEachIndexed{ i, v ->
            if(my_string.slice(0 .. i-1).equals(is_prefix)){
                answer = 1
                return@forEachIndexed
            }
            
        }
        return answer
    }
}