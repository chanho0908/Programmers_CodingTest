import java.util.*
import kotlin.math.sqrt

class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0
        val numbers = arrayListOf<Int>()

        for(i in nums.indices){
            for(j in i+1 until nums.size){
                for(k in j+1 until nums.size){
                    val n = nums[i] + nums[j] + nums[k]
                    numbers.add(n)
                }
            }
        }

        val n = numbers.maxOrNull()!!
        val primes = BooleanArray(n + 1) { true }
        primes[0] = false
        primes[1] = false

        for(i in 2..sqrt(n.toDouble()).toInt()){
            if(primes[i]){
                for(j in i*i..n step i){
                    primes[j] = false
                }
            }
        }

        numbers.forEach{
            if(primes[it]) answer++
        }

        return answer
    }
}