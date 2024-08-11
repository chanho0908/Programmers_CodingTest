    class Solution {
        fun solution(n: Int): Int {
            var answer = 0
            val arr = IntArray(n)
            arr[0] = 1
            arr[1] = 1

            for (i in 2 until n) {
                arr[i] = (arr[i - 2] % 1234567) + (arr[i - 1] % 1234567)
            }

            answer = arr[n - 1] % 1234567

            return answer
        }
    }
