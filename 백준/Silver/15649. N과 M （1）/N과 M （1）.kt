private lateinit var visited: BooleanArray
private var N = 0
private var M = 0

fun main(){
    val (n, m) = readln().split(" ").map { it.toInt() }
    N = n
    M = m
    visited = BooleanArray(N + 1)
    BackTracking(emptyList())
}

private fun BackTracking(num: List<Int>){
    if (num.size == M) {
        println("${num.joinToString(" ")} ")
        return
    }

    for (i in 1..N){
        if (visited[i].not()) {
            visited[i] = true
            BackTracking(num + i)
            visited[i] = false
        }
    }
}