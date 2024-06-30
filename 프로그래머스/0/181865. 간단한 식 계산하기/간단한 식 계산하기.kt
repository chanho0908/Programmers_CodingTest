import java.math.BigInteger

class Solution {
    fun solution(binomial: String): Long {
        val arr = binomial.split(" ")

        return when(arr[1]){
            "+" -> arr[0].toLong() + arr[2].toLong()
            "-" -> arr[0].toLong() - arr[2].toLong()
            else -> arr[0].toLong() * arr[2].toLong()
        }
    }
}