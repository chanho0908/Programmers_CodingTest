class Solution {
    fun solution(my_string: String): Int {
        // 내 풀이
        // var lt = 0
        // var sb = StringBuilder()
        // while(lt < my_string.length){
        //     if(my_string[lt].isDigit()) sb.append(my_string[lt])
        //     else{
        //         if (sb.isNotEmpty()){
        //             answer += sb.toString().toInt()
        //             sb.clear()
        //         }
        //     }
        //     lt++
        // }
        // if(sb.isNotEmpty()) answer += sb.toString().toInt()
        return my_string.split("[A-z]".toRegex())
            .filter(String::isNotEmpty)
            .sumOf(String::toInt)
    }
}