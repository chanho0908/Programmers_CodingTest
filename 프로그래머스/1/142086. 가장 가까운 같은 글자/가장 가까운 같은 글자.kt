class Solution {
    fun solution(s: String): IntArray {
    var answer = arrayListOf<Int>()
    val map = HashMap<Char, Int>()

    s.forEachIndexed { idx, v ->
        if (map.containsKey(v)){
            answer.add(idx - map[v]!!)
        }else{
            answer.add(-1)
        }
        map[v] = idx
        
    }

    return answer.toIntArray()
}
}