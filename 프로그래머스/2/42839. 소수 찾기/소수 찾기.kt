import kotlin.math.sqrt
    
class Solution {
    private lateinit var visited: BooleanArray
    private lateinit var numbers: String 
    private val answer = HashSet<Int>()
    
    fun DFS(word: String){
        if(word.isNotBlank()){
            val wordToInt = word.toInt()
            if(isPrime(wordToInt))
                answer.add(wordToInt)
        }
        
        for(i in numbers.indices){
            if(!visited[i]){
                visited[i] = true
                DFS(word + numbers[i])
                visited[i] = false
            }
        }
    }

    fun solution(numbers: String): Int {
        visited = BooleanArray(numbers.length + 1)
        this.numbers = numbers
        DFS("")
        return answer.size;
    }

    fun isPrime(n: Int): Boolean{
        if (n < 2) return false
        for (i in 2.. sqrt(n.toDouble()).toInt()){
            if (n % i == 0) return false
        }
        return true
    }
}