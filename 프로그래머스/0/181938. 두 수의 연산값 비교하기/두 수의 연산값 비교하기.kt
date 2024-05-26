import kotlin.math.max
class Solution {
    fun solution(a: Int, b: Int): Int = if("$a$b".toInt() == 2*a*b) "$a$b".toInt() else max("$a$b".toInt(), 2*a*b)
}