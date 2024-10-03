private lateinit var map: Array<BooleanArray>
private val dirX = intArrayOf(-1, 0, 1, 0)
private val dirY = intArrayOf(0, 1, 0, -1)
private var N = 0
private var T = 0
private var M = 0
private var K = 0

private fun DFS(i: Int, j: Int){
    map[i][j] = false

    for (dir in 0 until 4){
        val newX = i + dirX[dir]
        val newY = j + dirY[dir]

        if (newX in 1..M && newY in 1..N && map[newX][newY])
            DFS(newX, newY)
    }
}

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    // 테스트 케이스
    T = br.readLine().toInt()

    repeat(T) {
        val (m, n, k) = br.readLine().split(" ").map { it.toInt() }
        M = m // 가로 길이 10
        N = n // 세로 길이 // 8
        K = k // 배추가 심어진 위치의 수

        // (1,1) 부터 사용하기 위해 + 1
        map = Array(M + 1){ BooleanArray(N + 1) }

        // 배추가 심어진 위치의 수 만큼 반복해 배추의 위치를 입력받는다.
        repeat(k){
            // 배추의 좌표
            val (x, y) = br.readLine().split(" ").map { it.toInt() }
            map[x + 1][y + 1] = true
        }

        var answer = 0
        for (i in 1..M){
            for (j in 1..N){
                if (map[i][j]) {
                    DFS(i, j)
                    answer++
                }
            }
        }

        println(answer)
    }
}