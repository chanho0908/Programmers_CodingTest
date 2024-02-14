import kotlin.math.*;

class Solution {
    
    fun GCD(a: Int, b: Int): Int{
        if(b == 0 ) return a
        return GCD(b, (a % b))
    }
    
    fun LCM(a: Int, b: Int) = (a*b) / GCD(a, b)
    
    fun solution(n: Int): Int {
        
        return LCM(max(n, 6), min(n, 6)) / 6
    }
}