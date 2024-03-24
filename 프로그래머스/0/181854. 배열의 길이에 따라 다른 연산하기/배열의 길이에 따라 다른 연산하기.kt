class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        val answer = arr

        when(arr.size % 2){
            0 -> {
                for(x in 1 until arr.size step 2){
                    answer[x] += n
                }

            }
            else ->{
                for(x in arr.indices step 2){
                    answer[x] += n
                }
            }
        }

        return answer
    }
}