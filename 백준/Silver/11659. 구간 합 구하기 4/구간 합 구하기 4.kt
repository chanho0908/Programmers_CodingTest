import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val nm = br.readLine().split(" ").map { it.toInt() }
    val arr = br.readLine().split(" ").map { it.toInt() }
    val prefixSum = ArrayList<Int>()
    var sum = 0
    prefixSum.add(0)
    for (i in 1 ..  nm[0]) {
        sum += arr[i-1]
        prefixSum.add(sum)
    }

    for (i in 0 until nm[1]) {
        val panel = br.readLine().split(" ").map { it.toInt() }.toIntArray()
        if (panel.first() == panel.last()) println(arr[panel.first()-1])
        else println(prefixSum[panel.last()] - prefixSum[panel.first() -1])
    }
}