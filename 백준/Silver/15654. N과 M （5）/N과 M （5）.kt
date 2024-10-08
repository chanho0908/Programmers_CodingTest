private val answer = StringBuilder()
private lateinit var arr: IntArray
private lateinit var numbersArray: IntArray
private lateinit var visited: BooleanArray
private var N = 0
private var M = 0

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    N = n
    M = m
    arr = IntArray(N)
    visited = BooleanArray(N)
    numbersArray = IntArray(M)

    val numbers = readln().split(" ").map { it.toInt() }
    numbers.sorted().forEachIndexed{ i, v->
        arr[i] = v
    }

    BackTracking(0)
    println(answer)
}

private fun BackTracking(depth: Int) {
    if (depth == M) {
        numbersArray.forEach {
            answer.append(it).append(' ')
        }
        answer.append("\n")
        return
    }

    for ((idx, value) in arr.withIndex()){
        if (visited[idx].not()){
            visited[idx] = true
            numbersArray[depth] = value
            BackTracking(depth + 1)
            visited[idx] = false
        }
    }
}