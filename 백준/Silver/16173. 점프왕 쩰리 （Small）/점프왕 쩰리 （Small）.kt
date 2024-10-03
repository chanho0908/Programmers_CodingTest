private lateinit var map: MutableList<MutableList<Int>>
private var N = 0
private var dirY = intArrayOf(1, 0)
private var dirX = intArrayOf(0, 1)

private fun DFS(y: Int, x: Int){
    val block = map[y][x]
    map[y][x] = 0

    if (y == N && x == N) {
        return
    }

    for (i in 0..1){
        val newY = y + dirY[i] * block
        val newX = x + dirX[i] * block
        if (block != 0 && newX in 1..N && newY in 1..N)
            DFS(newY, newX)
    }
}

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    N = n
    map = MutableList(n + 1) { MutableList(n + 1) { 0 } }

    for (i in 1 .. N) {
        val line = br.readLine().split(" ").map { it.toInt() }
        for (j in 1 .. N) {
            map[i][j] = line[j-1]
        }
    }

    DFS(1,1)

    println(if (map[N][N] == 0) "HaruHaru" else "Hing")
}
