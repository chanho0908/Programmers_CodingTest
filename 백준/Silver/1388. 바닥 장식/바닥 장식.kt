
import javax.xml.stream.events.Characters

private lateinit var map: MutableList<MutableList<Char>>
private var answer = 0
private var N = 0
private var M = 0

private fun DFS(y: Int, x: Int){
    val node = map[y][x]
    map[y][x] = 'x'

    if (x + 1 in 1.. M && node == '-' && map[y][x + 1] == '-') DFS(y, x + 1)
    if (y + 1 in 1.. N && node == '|' && map[y + 1][x] == '|') DFS(y + 1, x)
}

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    N = n
    M = m

    map = MutableList(N + 1){ MutableList(M + 1){'-'} }

    for (i in 1..N) {
        val line = br.readLine()
        for (j in 1..M) {
            map[i][j] = line[j - 1]
        }
    }

    for (i in 1..N){
        for (j in 1..M){
            if (map[i][j] != 'x'){
                DFS(i, j)
                answer++
            }
        }
    }

    println(answer)
}