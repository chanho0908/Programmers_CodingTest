import java.util.*

class Solution {
    fun solution(operations: Array<String>): IntArray {
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
                        "1" -> {
                            if (minQ.isNotEmpty()) minQ.remove(maxQ.poll())
                        }
                        "-1" -> {
                            if (maxQ.isNotEmpty()) maxQ.remove(minQ.poll())
                        }
                    }
                }
            }
        }
        return if (minQ.isEmpty() and maxQ.isEmpty()){
            intArrayOf(0, 0)
        }else{
            intArrayOf(maxQ.poll(), minQ.poll())
        }
    }
}