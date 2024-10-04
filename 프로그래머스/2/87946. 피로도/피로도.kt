import kotlin.math.max

class Solution {
    private lateinit var dungeons: Array<IntArray>
    private lateinit var visited: BooleanArray
    private var answer = 0

    fun DFS(pilodo: Int, clear: Int){
        answer = max(answer, clear)

        dungeons.forEachIndexed{ i, dungeon ->
            if (!visited[i] && pilodo >= dungeon[0]){
                visited[i] = true
                DFS(pilodo - dungeon[1], clear + 1)
                visited[i] = false
            }
        }
    }

    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        this.dungeons = dungeons
        visited = BooleanArray(dungeons.size + 1) { false }
        DFS(k, 0)
        return answer
    }
}