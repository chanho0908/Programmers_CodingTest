class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        val sb = StringBuilder()
        my_string.mapIndexed{ i, v ->
            if(i == num1) sb.append(my_string.get(num2))
            else if(i == num2) sb.append(my_string.get(num1))
            else sb.append(v)
        }
        
        return sb.toString()
    }
}