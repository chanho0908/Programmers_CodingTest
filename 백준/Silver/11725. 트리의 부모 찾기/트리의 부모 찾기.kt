private lateinit var visited: BooleanArray
private lateinit var graph: Array<MutableList<Int>>
private lateinit var answer: IntArray

private fun DFS(node: Int){
    visited[node] = true

    for (i in graph[node]) {
        if (!visited[i]) {
            answer[i] = node
            DFS(i)
        }
    }
}

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()

    answer = IntArray(n + 1)
    visited = BooleanArray(n + 1)
    graph = Array(n + 1){ mutableListOf() }

    repeat(n-1){
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        graph[x].add(y)
        graph[y].add(x)
    }

    DFS(1)

    for (i in 2..n){
        bw.write("${answer[i]}")
        bw.newLine()
    }

    bw.flush()
    br.close()
    bw.close()
}