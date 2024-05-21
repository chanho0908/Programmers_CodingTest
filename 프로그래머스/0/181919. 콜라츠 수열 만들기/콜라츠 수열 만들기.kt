class Solution {
    fun solution(n: Int): IntArray {
        val answer = ArrayList<Int>()
        answer.add(n)
        var x = n
        while(x != 1){
            x = if(x % 2 == 0){
                x / 2
            }else{
                3 * x + 1
            }
            answer.add(x)
        }
        return answer.toIntArray()
    }
}