private lateinit var visited: BooleanArray
private lateinit var arr: IntArray
private lateinit var numbersArray: IntArray
private val answer = StringBuilder()
private var N = 0
private var M = 0

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    N = n
    M = m
    arr = IntArray(M)
    numbersArray = IntArray(N)
    visited = BooleanArray(N)

    readln().split(" ").map { it.toInt() }.sorted().forEachIndexed { i, v ->
        numbersArray[i] = v
    }

    backTracking(0, 0)
    println(answer.trim())
}

private fun backTracking(depth: Int, at: Int) {
    if (depth == M) {
        answer.append(arr.joinToString(" ")).append("\n")
        return
    }

    var lastN = -1
    for (i in at until N) {
        val v = numbersArray[i]
        if (visited[i].not() && lastN != v) {
            lastN = v
            arr[depth] = v
            backTracking(depth + 1, i)
            visited[i] = true
        }
        visited[i] = false
    }
}