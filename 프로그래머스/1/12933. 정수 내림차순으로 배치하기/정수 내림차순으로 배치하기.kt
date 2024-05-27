class Solution {
        fun solution(n: Long): Long = n.toString().map{ it.toInt() - '0'.toInt() }.sorted().reversed().joinToString("").toLong()
}