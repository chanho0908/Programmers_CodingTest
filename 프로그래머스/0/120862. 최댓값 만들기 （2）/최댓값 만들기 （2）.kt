import kotlin.math.max

class Solution {
    fun solution(numbers: IntArray): Int{
        val x = numbers.sorted().take(2).reduce{acc, i -> acc * i}
        val y = numbers.sorted().takeLast(2).reduce { acc, i -> acc * i }

        return max(y, x)
    }
}