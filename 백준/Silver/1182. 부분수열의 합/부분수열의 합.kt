
// https://www.acmicpc.net/problem/1182

private lateinit var arr: IntArray
private var S = 0
private var answer = 0

fun main() {
    val (n, s) = readln().split(" ").map { it.toInt() }
    S = s
    arr = IntArray(n)

    val num = readln().split(" ").map { it.toInt() }
    num.forEachIndexed { i, v ->
        arr[i] = v
    }

    BackTracking(0, 0)
    println(answer)
}

private fun BackTracking(at: Int, sum: Int) {
    if (sum == S && at > 0) {
        answer++
    }

    for (i in at until arr.size) {
        BackTracking(i + 1, sum + arr[i])
    }
}