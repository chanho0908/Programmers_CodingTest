private lateinit var arr: IntArray
private lateinit var numbersArray: IntArray
private var N = 0
private var M = 0
private val answer = StringBuilder()

fun main(){
    val (n, m) = readln().split(" ").map { it.toInt() }
    N = n
    M = m
    arr = IntArray(N)
    numbersArray = IntArray(M)

    val numbers = readln().split(" ").map { it.toInt() }
    numbers.sorted().forEachIndexed{ i, v->
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

    for (v in arr){
        numbersArray[depth] = v
        BackTracking(depth + 1)
    }
}