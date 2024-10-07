private val answer = StringBuilder()
private lateinit var arr: IntArray
private lateinit var visited: BooleanArray
private var N = 0
private var M = 0
fun main(){
    val (n, m) = readln().split(" ").map { it.toInt() }
    N = n
    M = m

    arr = IntArray(M)
    visited = BooleanArray(N + 1)
    BackTracking(1, 0)
    println(answer)
}

private fun BackTracking(start: Int, depth: Int){
    if (depth == M) {
        arr.forEach{
            answer.append(it).append(' ')
        }
        answer.append("\n")
        return
    }

    for (i in (start..N)){
        if (visited[i].not()){
            visited[i] = true
            arr[depth] = i
            BackTracking(i + 1, depth + 1)
            visited[i] = false
        }
    }
}