import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.BufferedWriter
import java.io.OutputStreamWriter

private lateinit var graph: Array<BooleanArray>
private lateinit var visited: BooleanArray
private var N = 0
private var M = 0
private var answer = 0

fun DFS(n: Int) {
    visited[n] = true
    (1..N).forEach { i ->
        if (!visited[i] && graph[n][i]) {
            DFS(i)
        }
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    N = n
    M = m

    graph = Array(N + 1) { BooleanArray(N + 1) }
    visited = BooleanArray(N + 1)

    repeat(M) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        graph[x][y] = true
        graph[y][x] = true
    }

    (1..N).forEach { i ->
        if (!visited[i]) {
            DFS(i)
            answer++
        }
    }

    bw.write("$answer\n")

    bw.flush()
    br.close()
    bw.close()
}
