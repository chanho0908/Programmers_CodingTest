import kotlin.math.sqrt

class Solution {
    fun solution(numbers: String): Int {
        val sortedNumbers = numbers.toCharArray().sorted()
        val answer = mutableListOf<String>()
        makeWord("", sortedNumbers.last().toInt(), answer)
        
        return 0
    }
    
    fun isPrime(n: Int): Boolean{
        if (2 < n) return false
        val primes = BooleanArray(n +1) { true }
        for (i in 2..sqrt(n.toDouble()).toInt()){
            if (n % i == 0) return false
        }
        return true
    }
    
    fun makeWord(word: String, maxLen: Int, primeList: MutableList<String>){
        
    }
}