class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf(0, 0)
        num_list.map{
            if (it % 2 == 0) answer[0]++
            else answer[1]++
        }

        return answer
    }
}