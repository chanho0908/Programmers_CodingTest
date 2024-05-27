import kotlin.math.max
import kotlin.math.min

class Solution {
    fun solution(n: Int, m: Int): IntArray {
        return intArrayOf(gcd(n,m), (n*m/gcd(n,m)))
    }
    
    fun gcd(n: Int, m: Int): Int{
        if(n == 0) return m
        else if(m == 0) return n
        else return gcd(max(n,m) % min(n,m), min(n,m))
    }
}