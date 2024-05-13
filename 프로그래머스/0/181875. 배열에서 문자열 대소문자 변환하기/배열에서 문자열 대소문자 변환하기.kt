class Solution {
    fun solution(strArr: Array<String>): Array<String> =
    strArr.mapIndexed{idx, c ->
        if(idx % 2 == 0) c.toLowerCase() else c.toUpperCase()
    }.toTypedArray()    
    
}