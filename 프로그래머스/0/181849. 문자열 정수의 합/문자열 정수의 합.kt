class Solution {
    fun solution(num_str: String) = num_str.map{ it.toChar() - '0'.toChar() }.sum()
}