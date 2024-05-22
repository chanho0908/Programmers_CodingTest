class Solution {
    fun solution(str1: String, str2: String): Int {
        var answer = 0
        for(i in 0 .. str2.length - str1.length){
        if(str2.slice(i until str1.length + i) == str1){
            answer = 1
            break
        }
    }
        return answer
    }
}