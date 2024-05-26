class Solution {
    fun solution(arr: IntArray): IntArray{
        val answer = arrayListOf<Int>()
        arr.map { n -> repeat(n){ answer.add(n) }}
        return answer.toIntArray()
    }
}