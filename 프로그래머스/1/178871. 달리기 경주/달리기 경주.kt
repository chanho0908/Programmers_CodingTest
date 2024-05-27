class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        var answer: Array<String>  = players
        val playerMap = mutableMapOf<String, Int>()
        answer.forEachIndexed{ i, v-> playerMap[v] = i }

        for(player in callings){
            // 호출된 선수의 등수
            val calledPlayerIdx = playerMap[player]
            
            if(calledPlayerIdx != null){
                //호출된 선수 앞 선수
                val currentPlayer = answer[calledPlayerIdx -1]
                
                // 호출된 선수
                answer[calledPlayerIdx -1] = player
                // 호출된 선수 앞 선수
                answer[calledPlayerIdx] = currentPlayer
                
                // 호출된 선수
                playerMap[player] = calledPlayerIdx -1
                // 호출된 선수 앞 선수
                playerMap[currentPlayer] = calledPlayerIdx
                
            }
        }

        return answer
    }
}