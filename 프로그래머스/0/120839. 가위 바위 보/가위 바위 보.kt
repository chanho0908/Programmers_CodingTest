class Solution {
    fun solution(rsp: String): String {
        val answer = StringBuilder()
        rsp.map{
            when(it){
                '2' -> answer.append("0")
                '0' -> answer.append("5")
                else -> answer.append("2")
            }
        }
        return answer.toString()
    } 
}