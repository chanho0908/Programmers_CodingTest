class Solution {
    fun solution(arr: IntArray, n: Int): IntArray = if(arr.size % 2 == 0){
        arr.mapIndexed{ i, v ->
            if(i % 2 != 0){
                v + n
            }else{
                v
            }
        }.toIntArray()
    }else{
        arr.mapIndexed{ i, v ->
            if(i % 2 == 0){
                v + n
            }else{
                v
            }
        }.toIntArray()
    }
}