class Solution {
    fun solution(dot: IntArray): Int {
        return if(dot[0] < 0 && dot[1] > 0){ 
            2 
        }else if(dot[0] < 0 && dot[1] < 0) {
            3
        }else if(dot[0] > 0 && dot[1] > 0) {
            1
        }else{
            4
        }
            
        
    }
}