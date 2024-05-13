class Solution {
    fun solution(num_list: IntArray): IntArray {
        val x = num_list.count { it % 2 == 0 }
        val y = num_list.count { it % 2 != 0 }
        return intArrayOf(x,y)
    }
}