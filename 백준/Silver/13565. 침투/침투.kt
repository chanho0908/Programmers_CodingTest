import java.util.StringTokenizer

private lateinit var map: MutableList<MutableList<Boolean>>
private lateinit var visited: MutableList<MutableList<Boolean>>
private var dirY: IntArray = intArrayOf(1, -1, 0, 0)
private var dirX: IntArray = intArrayOf(0, 0, 1, -1)
private var answer: Boolean = false

fun dfs(y: Int, x: Int) {
    if (y == map.size - 1) { // 마지막 행에 도달했는지 확인
        answer = true
        return
    }

    visited[y][x] = true
    for (i in 0..3) {
        val newY = y + dirY[i]
        val newX = x + dirX[i]
        if (newY in map.indices && newX in map[newY].indices && map[newY][newX] && !visited[newY][newX]) {
            dfs(newY, newX)
        }
    }
}

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val st = StringTokenizer(br.readLine())

    val N = st.nextToken().toInt()
    val M = st.nextToken().toInt()

    // 동적 배열 생성
    map = MutableList(N + 1) { MutableList(M + 1) { false } }
    visited = MutableList(N + 1) { MutableList(M + 1) { false } }

    for (i in 1..N) {
        val str = br.readLine()
        for (j in 1..M) {
            map[i][j] = (str[j - 1] == '0')
        }
    }

    for (j in 1..M) {
        if (map[1][j]) dfs(1, j)

    }

    if (answer) bw.write("YES")
    else bw.write("NO")

    bw.close()
    br.close()
}
