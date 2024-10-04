import java.util.StringTokenizer

private lateinit var map: MutableList<MutableList<Boolean>>
private var dirY = intArrayOf(-1, -1, 0, 1, 1, 1, 0, -1)
private var dirX = intArrayOf(0, 1, 1, 1, 0, -1, -1, -1)
private var N = 0
private var M = 0

private fun DFS(y: Int, x: Int){
    map[y][x] = false

    for (i in 0..7){
        val newY = y + dirY[i]
        val newX = x + dirX[i]
        if (newY in 1 .. N && newX in 1 .. M && map[newY][newX])
            DFS(newY, newX)
    }
}

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    while (true){
        var st = StringTokenizer(br.readLine())
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        if (N == 0 && M == 0) break;

        map = MutableList(N +1) { MutableList(M + 1) { false } }

        for (i in 1..N) {
            st = StringTokenizer(br.readLine())
            for (j in 1..M) map[i][j] = (st.nextToken().toInt() == 1)
        }

        var answer = 0
        for (i in 1..N){
            for (j in 1..M){
                if (map[i][j]) {
                    DFS(i, j)
                    answer++
                }
            }
        }
        bw.write("$answer")
        bw.newLine()
    }

    bw.flush()
    bw.close()
    br.close()
}