class Solution {
    fun solution(slice: Int, n: Int): Int {
        var answer: Int = 
        if(n % slice == 0){
            n / slice
        }else{
            n / slice + 1
        }
        
        return answer
    }
}