fun main(){
    val T = readln().toInt()
    val input = arrayListOf<String>()

    repeat(T){
        input.add(readln())
    }

    input.forEachIndexed { i, v ->
        println("Case # ${i + 1}:")
        val arr = v.map { it.toString() }
        val visited = BooleanArray(arr.size)
        backTracking(arr, "", visited)
    }
}

private fun backTracking(arr: List<String>, word: String, visited: BooleanArray){
    if (word.length == arr.size){
        println(word)
        return
    }

    arr.forEachIndexed { i, v ->
        if (visited[i].not()){
            visited[i] = true
            val newWord = word + v
            backTracking(arr, newWord, visited)
            visited[i] = false
        }
    }
}