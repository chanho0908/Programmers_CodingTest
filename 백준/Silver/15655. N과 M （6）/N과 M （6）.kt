private lateinit var arr: IntArray
private lateinit var numbersArray: IntArray
private lateinit var visited: BooleanArray
private var N = 0
private var M = 0

fun main(){
    val (n, m) = readln().split(" ").map { it.toInt() }
    N = n
    M = m
    arr = IntArray(N)
    visited = BooleanArray(N)
    numbersArray = IntArray(M)

    val numbers = readln().split(" ").map { it.toInt() }
    numbers.sorted().forEachIndexed{ i, v->
        arr[i] = v
    }

    BackTracking(0, 0)
}

private fun BackTracking(start: Int, depth: Int){
    if (depth == M){
        println(numbersArray.joinToString(" "))
        return
    }

    for (i in start until  N){
        //if (visited[i].not()) {
            //visited[i] = true
            numbersArray[depth] = arr[i]
            BackTracking(i +1, depth + 1)
            //visited[i] = false
        //}
    }
}