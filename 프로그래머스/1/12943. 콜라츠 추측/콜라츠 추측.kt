class Solution {
    fun solution(num: Int): Int {
        return recursive(num.toLong(), 0L).toInt()
    }
    
    tailrec fun recursive(n: Long, cnt: Long): Long = when{
            n == 1L -> cnt    
            cnt == 500L -> -1L
            else -> if(n % 2L == 0L) recursive(n / 2, cnt + 1) else  recursive(n * 3 + 1, cnt + 1)
        }
    
}