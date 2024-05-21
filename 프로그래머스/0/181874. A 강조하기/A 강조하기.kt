class Solution {
    fun solution(myString: String) = myString.map {
        if (it.equals('a', ignoreCase = true)) it.uppercaseChar()
        else it.lowercaseChar()
    }.joinToString("") {
        it.toString()
    }
}