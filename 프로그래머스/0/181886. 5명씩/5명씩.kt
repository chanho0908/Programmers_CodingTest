class Solution {
    fun solution(names: Array<String>) = names.filterIndexed{ i, v ->i % 5 == 0}.toTypedArray()
    
}