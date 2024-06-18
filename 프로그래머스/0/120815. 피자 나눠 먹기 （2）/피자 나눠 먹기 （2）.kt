class Solution {
    fun pizza(n: Int, cnt: Int): Int{
        if(n.times(cnt).rem(6) == 0) return cnt
        return pizza(n, cnt+1)
    }
    
    fun solution(n: Int): Int {
        return n.times(pizza(n, 1)).div(6)
    }
}