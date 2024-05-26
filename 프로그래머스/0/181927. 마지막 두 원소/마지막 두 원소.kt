class Solution {
    fun solution(num_list: IntArray): IntArray{
        val answer: MutableList<Int> = num_list.copyOf().toMutableList()
                        
        if(num_list.last() > num_list[num_list.size - 2] ){
                answer.add(num_list.last() - num_list[num_list.size - 2]  )
        }else{
                answer.add(num_list.last() * 2)
        }

        return answer.toIntArray()
    }
}