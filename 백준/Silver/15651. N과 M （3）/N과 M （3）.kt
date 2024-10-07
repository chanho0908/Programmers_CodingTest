private val answer = StringBuilder()
private lateinit var arr: IntArray
private var N = 0
private var M = 0

fun main(){
    val (n, m) = readln().split(" ").map { it.toInt() }
    N = n
    M = m

    arr = IntArray(M)

    DFS(0)
    println(answer)
}

private fun DFS(depth: Int) {
    if (depth == M) {
        arr.forEach {
            answer.append(it).append(' ')
        }
        answer.append("\n")
        return
    }

    for (i in 1..N){
        arr[depth] = i
        DFS(depth + 1)
    }
}