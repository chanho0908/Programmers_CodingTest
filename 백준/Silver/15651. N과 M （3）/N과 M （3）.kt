private val answer = mutableListOf<List<Int>>()
private lateinit var visited: BooleanArray
private var N = 0
private var M = 0

fun main(){
    val (n, m) = readln().split(" ").map { it.toInt() }
    N = n
    M = m
    visited = BooleanArray(N + 1)

    DFS(emptyList())
    println(answer.joinToString("\n") { it.joinToString(" ") })
}

private fun DFS(number: List<Int>) {
    if (number.size == M) {
        answer.add(number)
        return
    }

    for (i in 1..N){
        if (visited[i].not()){
            DFS(number + i)
            visited[i] = true
        }
        visited[i] = false
    }
}