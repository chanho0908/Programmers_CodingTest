import kotlin.math.max

class Solution {
    fun solution(a: Int, b: Int): Int = if("$a$b".toInt() == "$b$a".toInt()) "$a$b".toInt() else max("$b$a".toInt(),"$a$b".toInt())
}