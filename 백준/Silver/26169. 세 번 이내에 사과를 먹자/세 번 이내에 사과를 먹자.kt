
// https://www.acmicpc.net/problem/26169

/**
 * 5 x 5 크기의 보드가 주어진다. 보드는 1 x 1 크기의 정사각형 격자로 이루어져 있다.
 * 보드의 격자는 사과가 1개 있는 격자, 장애물이 있는 격자, 빈칸으로 되어 있는 격자로 구분된다.
 * 격자의 위치는 (r, c)로 표시한다. r은 행 번호, c는 열 번호를 나타낸다.
 * 행 번호는 맨 위 위치가 0이고 아래 방향으로 1씩 증가한다.
 * 열 번호는 맨 왼쪽 위치가 0이고 오른쪽으로 1씩 증가한다.
 * 즉, 맨 왼쪽 위 위치가 (0, 0), 맨 아래 오른쪽 위치가 (4, 4)이다.
 *
 * 현재 한 명의 학생이 (r, c) 위치에 있고 한 번의 이동으로 상, 하, 좌, 우 방향 중에서 한가지 방향으로 한 칸 이동할 수 있다.
 * 학생이 사과가 있는 칸으로 이동하면 해당 칸에 있는 사과를 1개 먹는다. 장애물이 있는 칸으로는 이동할 수 없다.
 * 학생이 지나간 칸은 학생이 해당 칸을 떠나는 즉시 장애물이 있는 칸으로 변경된다.
 * 즉, 학생이 해당 칸에서 상, 하, 좌, 우 방향으로 한 칸 이동하는 즉시 해당 칸은 장애물이 있는 칸으로 변경된다.
 *
 * 학생이 현재 위치 (r, c)에서 세 번 이하의 이동으로 사과를 2개 이상 먹을 수 있으면 1을 출력하고, 그렇지 않으면 0을 출력하자.
 * */

private val map = Array(6){IntArray(6){ -1 } }
private val dirX = listOf(1, -1, 0, 0)
private val dirY = listOf(0, 0, 1, -1)
private var answer = 0
private val MAX_SIZE = 6
fun main(){
    val br = System.`in`.bufferedReader()

    for (i in 0 until 5) {
        val line = br.readLine().split(" ").map { it.toInt() }
        line.forEachIndexed { j, v ->
            map[i+1][j+1] = v
        }
    }

    val (r, c) = br.readLine().split(" ").map { it.toInt() }
    if (map[r + 1][c + 1] == 1){
        DFS(r + 1, c + 1, 1, 0)
    }else{
        DFS(r + 1, c + 1, 0, 0)
    }
    println(answer)
}

private fun DFS(y: Int, x: Int, apple: Int, moveCount: Int){
    if (moveCount > 3) return
    if (apple >= 2) {
        answer = 1
        return
    }
    val originalValue = map[y][x]
    map[y][x] = -1

    for (i in 0..3){
        val newX = x + dirX[i]
        val newY = y + dirY[i]
        if (newX in 1 until MAX_SIZE && newY in 1 until MAX_SIZE && map[newY][newX] != -1) {
            val newApple = if (map[newY][newX] == 1) {
                apple + 1
            } else {
                apple
            }
            DFS(newY, newX, newApple, moveCount + 1)
        }
    }
    map[y][x] = originalValue
}
