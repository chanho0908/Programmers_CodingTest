import java.util.TreeSet

class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
    val answer = arrayListOf<Int>()
    val set = TreeSet<String>()
    keymap.forEach { set.add(it) }

    targets.forEach { target ->
        var min = 0
        var isFound = true

        target.forEach { t ->
            val hasKeyMap = set.filter { it.contains(t) }.minOfOrNull { it.indexOf(t) }
            if (hasKeyMap == null) {
                isFound = false
                return@forEach
            }
            else min += hasKeyMap + 1
        }

        if (isFound)answer.add(min) else answer.add(-1)
    }

    return answer.toIntArray()
}
}