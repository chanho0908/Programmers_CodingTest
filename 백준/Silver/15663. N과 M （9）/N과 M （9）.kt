// https://www.acmicpc.net/problem/15663

/**
 * 문제
 * N개의 자연수와 자연수 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
 *
 * N개의 자연수 중에서 M개를 고른 수열
 * */

private lateinit var arr: IntArray
private lateinit var visited: BooleanArray
private lateinit var numbersArray: IntArray

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

}

private fun BackTracking(depth: Int){
    if (depth == M){
        println(numbersArray.joinToString(" "))
        return
    }

    var lastN = -1
    arr.forEachIndexed{ i, v ->
        if (visited[i].not() && v != lastN){
            visited[i] = true
            numbersArray[depth] = v
            BackTracking( depth + 1)
            visited[i] = false
            lastN = v
        }
    }
}

/**
 * 예제 입력 2
 * 4 2
 * 9 7 9 1
 *
 * 예제 출력 2
 * 1 7
 * 1 9
 * 7 1
 * 7 9
 * 9 1
 * 9 7
 * 9 9
 * */