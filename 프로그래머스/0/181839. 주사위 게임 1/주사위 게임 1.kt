import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int): Int = if((a % 2 != 0) and (b % 2 != 0)){
       (a.toDouble().pow(2) + b.toDouble().pow(2)).toInt()
    }else if((a % 2 != 0) or (b % 2 != 0)){
        2*(a + b)
    }else{
        abs((a-b))
    }
}