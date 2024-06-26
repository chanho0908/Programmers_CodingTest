class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String = my_strings.mapIndexed{ i, v->
      v.slice(parts[i][0] .. parts[i][1])
    }.joinToString("")
}