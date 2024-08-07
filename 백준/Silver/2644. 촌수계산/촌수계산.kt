import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    val st = StringTokenizer(br.readLine())
    val person1 = st.nextToken().toInt()
    val person2 = st.nextToken().toInt()

    val m = br.readLine().toInt()

    val graph = Array(n + 1) { mutableListOf<Int>() }

    // 부모 자식 관계 입력
    repeat(m) {
        val tokens2 = StringTokenizer(br.readLine())
        val parent = tokens2.nextToken().toInt()
        val child = tokens2.nextToken().toInt()
        graph[parent].add(child)
        graph[child].add(parent)
    }

    // BFS를 사용하여 촌수 계산
    val result = BFS(graph, n, person1, person2)
    println(result)
}

fun BFS(graph: Array<MutableList<Int>>, n: Int, start: Int, end: Int): Int {
    val visited = BooleanArray(n + 1)
    val distance = IntArray(n + 1)

    val q: Queue<Int> = LinkedList()
    q.add(start)
    visited[start] = true

    while (q.isNotEmpty()) {
        val current = q.poll()

        for (neighbor in graph[current!!]) {
            if (!visited[neighbor]) {
                visited[neighbor] = true
                distance[neighbor] = distance[current] + 1
                q.add(neighbor)

                if (neighbor == end) return distance[neighbor]
            }
        }
    }
    return -1
}
