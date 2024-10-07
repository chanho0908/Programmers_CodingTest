private lateinit var visited: BooleanArray
private lateinit var arr: IntArray
private val answer = StringBuilder()
private var N = 0
private var M = 0

fun main(){
    val (n, m) = readln().split(" ").map { it.toInt() }
    N = n
    M = m
    arr = IntArray(M)
    visited = BooleanArray(N + 1)
    BackTracking(0)
    print(answer)
}

private fun BackTracking(depth: Int){
    if (depth == M) {
        arr.forEach {
            answer.append(it).append(' ')
        }
        answer.append('\n')
        return
    }

    for (i in 1..N){
        if (!visited[i]) {
            visited[i] = true
            arr[depth] = i
            BackTracking(depth + 1)
            visited[i] = false
        }
    }
}