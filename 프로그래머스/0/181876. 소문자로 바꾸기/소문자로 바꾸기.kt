class Solution {
    fun solution(myString: String): String = myString.map{it -> it.toLowerCase()}.joinToString("")
}