private lateinit var visited: BooleanArray
private val answer = StringBuilder()
private var N = 0
private var M = 0

fun main(){
    val (n, m) = readln().split(" ").map { it.toInt() }
    N = n
    M = m
    visited = BooleanArray(N + 1)
    BackTracking(mutableListOf())
    print(answer)
}

private fun BackTracking(num: MutableList<Int>){
    if (num.size == M) {
        answer.append(num.joinToString(" ")).append("\n")
        return
    }

    for (i in 1..N){
        if (visited[i].not()) {
            visited[i] = true
            num.add(i)
            BackTracking(num)
            num.removeAt(num.size - 1)
            visited[i] = false
        }
    }
}