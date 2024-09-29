import java.util.Stack

class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
    var answer = 0
    val st = Stack<Int>()

    moves.forEach { m ->
        val target = m -1
        var idx = 0

        while (idx < board.size && board[idx][target] == 0){
            idx++
        }

        if (idx < board.size) {
            val fork = board[idx][target]
            board[idx][target] = 0
            
            if (st.isNotEmpty() && st.peek() == fork) {
                st.pop()
                answer += 2
            } else {
                st.push(fork)
            }
        }
    }

    return answer
}
}