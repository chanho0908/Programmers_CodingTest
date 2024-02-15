class Solution {
    fun solution(emergency: IntArray): IntArray {
        var list = ArrayList<Int>()

        val sortedArray = emergency.sortedDescending()

        emergency.forEach { num ->
            list.add(sortedArray.indexOf(num) +1)
        }

        return list.toIntArray()
    }
}