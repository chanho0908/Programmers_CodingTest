package com.example.algorithm.backjoon.kotlin.backTracking

private lateinit var words: List<String>
private lateinit var visited: BooleanArray
private var totalCount = 0
private var targetCount = 0
private var isFind = false

fun main() {
    val br = System.`in`.bufferedReader()
    var line: String?

    while (br.readLine().also { line = it } != null) {
        val parts = line!!.split(" ")
        words = parts[0].map { it.toString() }

        targetCount = parts[1].toInt()
        visited = BooleanArray(words.size)
        isFind = false
        totalCount = 0

        print("${parts.joinToString(" ")} = ")

        BackTracking(
            depth = 0,
            permutation = StringBuilder(),
        )
        if (isFind.not()) println("No permutation")
    }
}

private fun BackTracking(
    depth: Int,
    permutation: StringBuilder
){
    if (totalCount == targetCount) return

    if (depth == words.size) {
        totalCount++
        if (totalCount == targetCount) {
            isFind = true
            println(permutation)
        }
        return
    }

    for (i in words.indices) {
        if (visited[i].not()) {
            visited[i] = true
            permutation.append(words[i])

            BackTracking(
                depth = depth + 1,
                permutation = permutation,
            )
            permutation.deleteCharAt(permutation.length - 1)
            visited[i] = false
        }
    }
}