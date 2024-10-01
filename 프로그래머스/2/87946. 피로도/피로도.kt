import kotlin.math.max 

class Solution {
    var maxClearTime = 0

    fun letGoDungeons(k: Int, dungeons: Array<IntArray>, clearTime: Int, visited: BooleanArray){
        maxClearTime = max(maxClearTime, clearTime)

        for(i in dungeons.indices){
            if (visited[i]) continue
            
            val minFatigue = dungeons[i][0]
            val consumeFatigue = dungeons[i][1]

            // 던전을 돌 수 있다면
            if(minFatigue <= k){
                // 1. 현재 피로도에서 던전 클리어에 필요한 피로도를 뺀다.
                // 2. 클리어 횟수를 증가한다.
                visited[i] = true
                letGoDungeons(k - consumeFatigue, dungeons, clearTime + 1, visited)
                visited[i] = false
            }
        }
    }

    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        val visited = BooleanArray(dungeons.size)
        letGoDungeons(k, dungeons, 0, visited)
        return maxClearTime
    }
}