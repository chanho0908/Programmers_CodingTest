private lateinit var graph: Array<MutableList<Int>>
private lateinit var visited: BooleanArray
private var answer = 0
private var N = 0

private fun DFS(node: Int){
    visited[node] = true
    answer++

    for (i in graph[node]){
        if (!visited[i])
            DFS(i)
    }
}

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    N = br.readLine().toInt()
    val m = br.readLine().toInt()

    graph = Array(N + 1){ mutableListOf() }
    visited = BooleanArray(N + 1)

    repeat(m){
        val (x,y) = br.readLine().split(" ").map { it.toInt() }
        graph[x].add(y)
        graph[y].add(x)
    }

    DFS(1)

    bw.write("${answer -1}")

    bw.flush()
    br.close()
    bw.close()
}