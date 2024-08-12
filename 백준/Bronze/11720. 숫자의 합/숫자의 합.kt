import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine().toInt()
    println(br.readLine().map { it.digitToInt() }.sum())
}