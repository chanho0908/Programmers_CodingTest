class Solution {
    fun solution(my_str: String, n: Int): Array<String> {
        val arr = my_str.chunked(n)
        return Array<String>(arr.size){arr[it]}
    }
}
