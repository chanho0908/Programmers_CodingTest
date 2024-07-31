import java.util.*

class Solution {fun solution(operations: Array<String>): IntArray {
        val answer = IntArray(2) { 0 }
        val minQ = PriorityQueue<Int>()
        val maxQ = PriorityQueue<Int>(Collections.reverseOrder())

        for (operation in operations) {
            val op = operation.split(" ")
            val n = op[1].toInt()
            when (op[0]) {
                "I" -> {
                    minQ.offer(n)
                    maxQ.offer(n)
                }
                "D" -> {
                    when (op[1]) {
                        "-1" -> {
                            if (maxQ.isNotEmpty()) {
                                maxQ.remove(minQ.poll())
                            }
                        }
                        else -> {
                            if (minQ.isNotEmpty()) {
                                minQ.remove(maxQ.poll())
                            }
                        }
                    }
                }
            }
        }

        if (maxQ.isNotEmpty()) answer[0] = maxQ.peek() // 최댓값
        if (minQ.isNotEmpty()) answer[0] = minQ.peek() // 최댓값
        return answer
    }
}