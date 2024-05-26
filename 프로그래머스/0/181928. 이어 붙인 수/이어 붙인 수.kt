class Solution {
    fun solution(num_list: IntArray): Int = num_list.filter{ it % 2  == 0}.joinToString("").toInt() + num_list.filter{ it % 2 != 0}.joinToString("").toInt()
}