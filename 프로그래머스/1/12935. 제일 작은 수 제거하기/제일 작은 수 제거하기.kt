import kotlin.collections.min

class Solution {
    fun solution(arr: IntArray): IntArray = if(arr.size == 1) intArrayOf(-1) else arr.filterNot{ it == arr.minOrNull() }.toIntArray()

}