class Solution {
    fun solution(numbers: IntArray): Int{
        val arr = intArrayOf(1,2,3,4,5,6,7,8,9)
        return arr.filter { n ->
                !numbers.contains(n)
            }.sum()
    }
}   