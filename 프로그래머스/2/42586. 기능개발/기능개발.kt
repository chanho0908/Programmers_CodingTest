class Solution(){
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
    val answer = mutableListOf<Int>()
    val workDays = mutableListOf<Int>()

    for (i in progresses.indices){
        var cnt = 0
        while (progresses[i] < 100){
            progresses[i] += speeds[i]
            cnt++
        }
        workDays.add(cnt)
    }
    var lt = 0
    var rt = 0
    var works = 1
    while(lt != workDays.size-1){
        if(workDays[rt] >= workDays[lt+1]){
            works++
        }
        else {
            answer.add(works)
            rt = lt+1
            works = 1
        }
        lt++
    }
    answer.add(works)
    return answer.toIntArray()
}

}