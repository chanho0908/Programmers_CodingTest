private lateinit var visited: BooleanArray
private lateinit var graph: Array<MutableList<Int>>
private lateinit var answer: IntArray

private var order = 1

private fun DFS(idx: Int){
    visited[idx] = true
    answer[idx] = order++

    for (neighbor in graph[idx]) {
        if (!visited[neighbor]) {
            DFS(neighbor)
        }
    }
}

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m, r) = br.readLine().split(" ").map { it.toInt() }

    graph = Array(n + 1) { mutableListOf() }
    visited = BooleanArray(n + 1)
    answer = IntArray(n + 1)

    repeat(m){
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        graph[x].add(y)
        graph[y].add(x)
    }

    (1..n).forEach { graph[it].sort() }

    DFS(r)

    (1..n).forEach { i -> bw.write("${answer[i]}\n") }

    bw.flush()
    bw.close()
    br.close()
}