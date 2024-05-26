class Solution {
    fun solution(money: Int): IntArray {
        var answer = arrayListOf<Int>()
        answer.add(money / 5500)
        answer.add(money % 5500)
    
        return answer.toIntArray()
    }
}