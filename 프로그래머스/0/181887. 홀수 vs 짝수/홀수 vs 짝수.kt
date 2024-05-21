import kotlin.math.max

class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var answer2: Int = 0
        num_list.mapIndexed{ idx, num ->
            if(idx % 2 == 0){
                answer += num
            }else{
                answer2 += num
            }
        }
        return max(answer, answer2)
    }
}