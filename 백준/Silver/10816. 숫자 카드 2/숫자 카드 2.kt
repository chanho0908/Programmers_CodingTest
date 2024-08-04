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
        var s = 0
        var e = N

        // 오른쪽
        while (s < e){
            val m = (s + e) / 2
            if (a[m] > v) e = m
            else s = m + 1
        }
        val rightEnd = e

        // 왼쪽
        s = 0
        e = N
        while (s < e){
            val m = (s + e) / 2
            if (a[m] >= v) e = m
            else s = m + 1
        }
        val leftEnd = s
        answer[i] = rightEnd - leftEnd
    }
    print(answer.joinToString(" "))
}
