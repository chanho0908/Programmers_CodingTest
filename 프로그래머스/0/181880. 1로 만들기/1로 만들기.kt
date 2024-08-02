class Solution {
    tailrec fun recursion(cnt: Int, n: Int): Int{
        return if(n == 1) cnt
            else if(n % 2 == 0) recursion(cnt+1, n/2)
            else recursion(cnt+1, (n-1)/2)
    }
    
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        num_list.forEach{
            answer += recursion(0, it)
        }
        return answer
    }
}