class Solution {
    fun solution(my_string: String, index_list: IntArray): String {
        val sb = StringBuilder()
        index_list.map{
            sb.append(my_string[it])
        }
        return sb.toString()
    }
}