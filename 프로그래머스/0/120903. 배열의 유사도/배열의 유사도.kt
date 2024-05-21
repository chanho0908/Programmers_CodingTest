class Solution {
    fun solution(s1: Array<String>, s2: Array<String>) = s1.filter { s2.contains(it) }.count()
}