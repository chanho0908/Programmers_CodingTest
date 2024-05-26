class Solution {
    fun solution(n: Int, control: String): Int {
        var answer: Int = n
        control.map{
            if(it == 'w') answer += 1
            else if( it == 's') answer -=1
            else if( it == 'd') answer += 10
            else answer -= 10
        }
        return answer
    }
}