import kotlin.math.max
import kotlin.math.min

class Solution {
    fun solution(sizes: Array<IntArray>): Int {
    for(arr in sizes){
        if (arr[0] < arr[1]){
            val swap = arr[0]
            arr[0] = arr[1]
            arr[1] = swap
        }
    }

    var maxN = 0
    var minN = 0
    for (arr in sizes){
        maxN = max(maxN, arr[0])
        minN = max(minN, arr[1])
    }

    return maxN * minN
}
}