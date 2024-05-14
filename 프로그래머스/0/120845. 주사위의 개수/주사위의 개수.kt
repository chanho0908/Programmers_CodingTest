import kotlin.math.floor

class Solution {
  fun solution(box: IntArray, n: Int): Int = box.map{ it / n}.reduce{it, acc -> it * acc }
    
}