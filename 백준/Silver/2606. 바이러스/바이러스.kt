private lateinit var graph: Array<MutableList<Int>>
private lateinit var visited: BooleanArray
private var answer = 0

private fun DFS(node: Int) {
    visited[node] = true
    answer++

    for (i in graph[node]) {
        if (!visited[i]) {
            DFS(i)
        }
    }
}

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val m = br.readLine().toInt()

    graph = Array( n + 1){ mutableListOf() }
    visited = BooleanArray(n + 1)

    repeat(m){
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }

    DFS(1)

    bw.write("${answer - 1}")

    bw.flush()
    bw.close()
    br.close()
}
