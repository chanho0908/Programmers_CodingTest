import java.util.Stack

class Solution {
    fun solution(arr: IntArray): IntArray {
        val st = Stack<Int>()
        var i = 0
        while(i < arr.size){
            if(st.isEmpty() || st.peek() != arr[i]){
                st.push(arr[i])
                i++
            }else if(st.peek() == arr[i]){
                st.pop()
                i++
            }
        }
        return if(st.isEmpty()) intArrayOf(-1) else st.toIntArray()
    }
}