class Solution {
    fun solution(num_list: IntArray) = if(num_list.size >= 11){
            num_list.sum()
        }else{
            num_list.fold(1){acc, v -> acc * v}
        }
}