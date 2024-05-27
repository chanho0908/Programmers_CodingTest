class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val x = arr.filter { it % divisor == 0 }
        return if (x.isNotEmpty()) {
            x.sorted().toIntArray()
        } else {
            intArrayOf(-1)
        }
    }
}
