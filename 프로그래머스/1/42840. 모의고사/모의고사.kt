class Solution {
    fun solution(answers: IntArray): IntArray {
    val scores = IntArray(3)
    val patterns = arrayOf(
        intArrayOf(1, 2, 3, 4, 5),
        intArrayOf(2, 1, 2, 3, 2, 4, 2, 5),
        intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
    )

    answers.forEachIndexed{ idx, answer ->
        patterns.forEachIndexed { i, pattern ->
            if (answer == pattern[idx % pattern.size]) {
                scores[i]++
            }
        }
    }

    return scores.indices.filter { scores[it] == scores.maxOrNull()!! }.map { it + 1 }.toIntArray()
}
}