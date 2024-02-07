class Solution {
    fun solution(money: Int): IntArray {
    
        val x =  money / 5500
        val y = money - 5500 * x
        var answer: IntArray = intArrayOf(x, y)
        return answer
        
    }
}