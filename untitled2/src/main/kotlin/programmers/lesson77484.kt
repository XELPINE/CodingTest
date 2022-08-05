package programmers

fun main()
{
    // https://school.programmers.co.kr/learn/courses/30/lessons/77484

    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer = mutableListOf<Int>()

        // 0인 값들을 모두 맞췄다고 가정한 것이 최고 + 모두 틀렸다고 가정한것이 최악
        // 맞춘 값들을 모두 빼고, 수량 비교?

        var equalCount = 0
        var win_numsList : MutableList<Int> = win_nums.toCollection(ArrayList())

        val zeroCount = lottos.count { it == 0 }    // 로또번호 중 0인 갯수

        // 로또번호와 일치한 것의 갯수
        for (winItem in win_numsList)
        {
            for (myItem in lottos)
            {
                if (myItem == winItem)
                {
                    equalCount++
                    break
                }
            }
        }

        when (equalCount + zeroCount)
        {
            6 -> answer.add(1)
            5 -> answer.add(2)
            4 -> answer.add(3)
            3 -> answer.add(4)
            2 -> answer.add(5)
            else -> answer.add(6)
        }

        when (equalCount)
        {
            6 -> answer.add(1)
            5 -> answer.add(2)
            4 -> answer.add(3)
            3 -> answer.add(4)
            2 -> answer.add(5)
            else -> answer.add(6)
        }




        return answer.toIntArray()
    }

    solution(intArrayOf(44, 1, 0, 0, 31, 25), intArrayOf(31, 10, 45, 1, 6, 19))
}