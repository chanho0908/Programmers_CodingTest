class Solution {
  fun solution(sides: IntArray): Int = if(sides.sorted().take(2).sum() > sides.maxOrNull()!!) 1 else 2
}