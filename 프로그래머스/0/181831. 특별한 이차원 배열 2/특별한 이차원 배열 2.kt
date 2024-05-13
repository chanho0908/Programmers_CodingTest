class Solution {
    fun solution(arr: Array<IntArray>): Int = if (arr.indices.all { i -> arr[i].indices.all { j -> arr[i][j] == arr[j][i] } }) 1 else 0

}