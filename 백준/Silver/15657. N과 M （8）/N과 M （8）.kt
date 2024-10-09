private lateinit var arr: IntArray
private lateinit var numbersArray: IntArray
private var N = 0
private var M = 0
private val result = StringBuilder()  // 출력 최적화를 위한 StringBuilder

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    N = n
    M = m
    arr = IntArray(N)
    numbersArray = IntArray(M)

    val numbers = readln().split(" ").map { it.toInt() }
    numbers.sorted().forEachIndexed { i, v ->
        arr[i] = v
    }

    BackTracking(0, 0)

    println(result)
}

private fun BackTracking(start: Int, depth: Int) {
    if (depth == M) {
        result.append(numbersArray.joinToString(" ")).append("\n")
        return
    }

    for (i in start until N) {
        numbersArray[depth] = arr[i]
        BackTracking(i, depth + 1)
    }
}
