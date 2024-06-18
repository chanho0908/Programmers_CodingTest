class Solution {
    fun solution(cipher: String, code: Int): String {
        var answer = cipher.filterIndexed{ i, v ->
            (i+1) % code == 0 
        }
        
        return answer
    }
}