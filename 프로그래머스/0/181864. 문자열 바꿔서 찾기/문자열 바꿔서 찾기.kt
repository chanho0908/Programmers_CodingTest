class Solution {
    fun solution(myString: String, pat: String): Int  {
        val x = myString.map {
            if (it == 'A') 'B'
            else 'A'
        }.joinToString("")
        return if (x.contains(pat)) 1 else 0
    }
}