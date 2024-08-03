import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val a = br.readLine().toInt()
    val n = br.readLine().split(" ").map(String::toInt).sorted()
    val b = br.readLine().toInt()
    val m = br.readLine().split(" ").map(String::toInt)

    m.forEach{
        var flag = false
        var start = 0
        var end = a - 1

        while (start <= end){
            var mid = (start + end) / 2
            val x = n[mid]
           if (x == it){
               flag = true
               break
           }

           if (it < x){
               end = mid -1
           }else{
               start = mid +1
           }
        }

        if (flag) println(1)
        else println(0)
    }
}