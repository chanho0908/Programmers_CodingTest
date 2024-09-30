class Solution {
    fun solution(answers: IntArray): IntArray {
        val answer = arrayListOf<Int>()
        val s1 = intArrayOf(1, 2, 3, 4, 5)
        val s2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val s3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        var s1Answer = 0
        var j = 0
        answers.forEach{ v ->
            if(j >= s1.size) j = 0
            if(v == s1[j]) s1Answer++
            j++
        }

        var s2Answer = 0
        j=0
        answers.forEach{ v ->
            if(j >= s2.size) j = 0
            if(v == s2[j]) s2Answer++
            j++
        }

        var s3Answer = 0
        j=0
        answers.forEach{ v ->
            if(j >= s3.size) j = 0
            if(v == s3[j]) s3Answer++
            j++
        }

        val max = maxOf(s1Answer, s2Answer, s3Answer)
        if (s1Answer == max) answer.add(1)
        if (s2Answer == max) answer.add(2)
        if (s3Answer == max) answer.add(3)
        
        return answer.toIntArray()
    }
}