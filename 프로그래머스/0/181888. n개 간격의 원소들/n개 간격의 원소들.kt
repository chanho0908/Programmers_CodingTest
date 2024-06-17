class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer = ArrayList<Int>()
        for(i in 0 until num_list.size step n){
            answer.add(num_list[i])
        }
        return answer.toIntArray()
    }
}