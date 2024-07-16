class Solution {
    fun solution(myString: String, pat: String): Int {
        var answer: Int = 0
        for(lt in 0 .. myString.length-pat.length ){
            if(myString.slice(lt..lt+pat.length-1) == pat) answer++
        }
        return answer
    }
}