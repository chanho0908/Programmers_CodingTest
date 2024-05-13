class Solution {
    fun solution(myString: String, pat: String): Int = if(myString.contains(pat, ignoreCase=true)) 1 else 0
    
}