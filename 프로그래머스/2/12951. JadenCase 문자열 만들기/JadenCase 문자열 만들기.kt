class Solution {
    fun solution(s: String): String {
        val sb = StringBuilder()
        s.split(" ").map{
            if(it.isEmpty()){
                sb.append(" ")
            }else{
                if (!it[0].isDigit()) {
                    sb.append(
                        "${it[0].toUpperCase() + it.substring(1, it.length).toCustomLowerCase()} "
                    )
                } else {
                    sb.append("${it[0] + it.substring(1, it.length).toCustomLowerCase()} ")}
            }
        }
        sb.deleteAt(sb.lastIndex)
        return sb.toString()
    }

    private fun String.toCustomLowerCase(): String{
        return this.map{it.toLowerCase()}.joinToString("")
    }
}