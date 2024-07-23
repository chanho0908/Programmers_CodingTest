import kotlin.math.abs

class Solution {
    fun solution(x: Int, n: Int): LongArray {
        val i = abs(x.toLong())
        val j = n.toLong()
        return if(x < 0){
            (i..i*j step i).map { -it }.toLongArray()
        }else if(x == 0){
           LongArray(n){0}
        }else {
            (i..i*j step i).toList().toLongArray()
        }   
    }
}