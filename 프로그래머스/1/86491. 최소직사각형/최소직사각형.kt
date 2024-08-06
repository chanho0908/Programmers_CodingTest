import kotlin.math.max
import kotlin.math.min

class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var maxN = 0
        var minN = 0
        for (arr in sizes){
            val s = arr.sortedDescending()
            maxN = max(maxN, s[0])
            minN = max(minN, s[1])
        }

        return maxN * minN
    }
}