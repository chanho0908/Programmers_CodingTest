import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()
    val a = br.readLine().split(" ").map(String::toInt).sorted()
    val M = br.readLine().toInt()
    val b = br.readLine().split(" ").map(String::toInt)
    val answer = IntArray(M){ 0 }

    b.forEachIndexed{ i, v ->
        var flag = false
        var start = 0
        var end = N - 1

        while (start <= end){
            val mid = (start + end) / 2
            if (v == a[mid]){
                flag = true
                break
            }

            if (v < a[mid]) end = mid - 1
            else start = mid +1
        }
        answer[i] = if (flag) 1 else 0
    }
    print(answer.joinToString(" "))
}