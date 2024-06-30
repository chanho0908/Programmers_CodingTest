class Solution {
    fun solution(my_string: String, m: Int, c: Int): String {
        val sb = StringBuilder()
        for(x in my_string.indices step m){
            sb.append(my_string.substring(x, x+m)[c-1])
        }
        return sb.toString()
    }
}