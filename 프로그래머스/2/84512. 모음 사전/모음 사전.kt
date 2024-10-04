import java.util.*

class Solution {
    private lateinit var target: String
    private var arr = listOf("A", "E", "I", "O", "U")
    private var wordSet = TreeSet<String>()
    
    fun DFS(w: String){
        wordSet.add(w)
        if(w == target) return
        
        if(w.length == 5) return
        
        for(i in arr.indices){
            DFS(w + arr[i])
        }
    }
    
    fun solution(word: String): Int {
        target = word
        DFS("")
        return wordSet.indexOf(word)
    }
}