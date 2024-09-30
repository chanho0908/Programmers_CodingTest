import kotlin.math.sqrt

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        
        for(i in 1..number){
            var yaksu = 0
            val sqrt = sqrt(i.toDouble()).toInt()

            for(j in 1..sqrt){
                if(i % j == 0){ 
                    yaksu++
                    
                    // 완전 제곱수일 때 중복 제거
                    if(j != i/j) yaksu++
                }
            }
            if(yaksu > limit) answer += power
            else answer += yaksu
        }
        return answer
    }
}