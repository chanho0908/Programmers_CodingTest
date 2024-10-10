private lateinit var arr: IntArray
private lateinit var visited: BooleanArray
private lateinit var numbersArray: IntArray
private val answer = StringBuilder()
private var N = 0
private var M = 0

fun main(){
    val (n, m) = readln().split(" ").map { it.toInt() }
    N = n
    M = m
    arr = IntArray(N)
    visited = BooleanArray(N)
    numbersArray = IntArray(M)

    val numbers = readln().split(" ").map { it.toInt() }.sorted()
    numbers.forEachIndexed { i, v ->
        arr[i] = v
    }
    BackTracking(0)
    println(answer)
}

private fun BackTracking(depth: Int){
    if (depth == M){
        answer.append(numbersArray.joinToString(" ")).append("\n")
        return
    }

    var lastN = -1
    for (i in arr.indices){
        if (visited[i].not() && arr[i] != lastN){
            numbersArray[depth] = arr[i]
            BackTracking(depth + 1)
            visited[i] = true
        }
        visited[i] = false
        lastN = arr[i]
    }
}