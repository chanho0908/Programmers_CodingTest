import java.util.*

fun main() {
    val n = readLine()!!.toInt()
    val map = Array(n) { readLine()!!.map { it - '0' }.toIntArray() }
    val visited = Array(n) { BooleanArray(n) }
    val dx = arrayOf(0, 0, -1, 1)
    val dy = arrayOf(-1, 1, 0, 0)
    val complexSizes = mutableListOf<Int>()

    fun dfs(x: Int, y: Int): Int {
        visited[x][y] = true
        var count = 1

        for (i in 0 until 4) {
            val nx = x + dx[i]
            val ny = y + dy[i]

            if (nx in 0 until n && ny in 0 until n && !visited[nx][ny] && map[nx][ny] == 1) {
                count += dfs(nx, ny)
            }
        }
        return count
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (map[i][j] == 1 && !visited[i][j]) {
                complexSizes.add(dfs(i, j))
            }
        }
    }

    complexSizes.sort()
    println(complexSizes.size)
    for (size in complexSizes) {
        println(size)
    }
}
