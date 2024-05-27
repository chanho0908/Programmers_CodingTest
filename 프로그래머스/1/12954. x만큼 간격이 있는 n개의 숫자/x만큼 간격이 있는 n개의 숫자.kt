class Solution {
    fun solution(x: Int, n: Int): LongArray {
        val i = x.toLong()
        val j = n.toLong()
        return if (i > 0) {
                (i..(i * j) step i).toList().toLongArray()
        } else if(i == 0.toLong()){
                LongArray(n){0}
        }else {
                (i downTo (i * j) step -i).toList().toLongArray()
        }
    }
}