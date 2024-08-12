import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val N = reader.readLine().toInt()
    val pQ = PriorityQueue<Int>()

    for (i in 0 until N) {
        pQ.add(reader.readLine().toInt())
    }

    while (pQ.isNotEmpty()){
        println(pQ.poll()!!)
    }
}
