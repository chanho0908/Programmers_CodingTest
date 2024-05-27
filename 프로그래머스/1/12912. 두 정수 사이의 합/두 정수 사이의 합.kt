import kotlin.math.max
import kotlin.math.min

class Solution {
    fun solution(a: Int, b: Int): Long = (min(a,b).toLong() .. max(a, b).toLong()).toList().sum()
}