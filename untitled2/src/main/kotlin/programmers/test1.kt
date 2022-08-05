package programmers

import kotlin.math.pow

fun main ()
{
    fun solution(n: Long): Long {


        var answer = Math.sqrt(n.toDouble())

        // 값이 자연수인가
        if (answer % 1.0 == 0.0)
        {
//            println("TRUE")
            return (answer+1.0).pow(2.0).toLong()
        }
        else
        {
//            println("FALSE")
            return -1
        }

//        return answer.toInt()
    }


    println(solution(121))
    println(solution(3))



//    fun solution(n: Long): Long
//    {
//        var textList = n.toString().toCharArray().toMutableList()
//
//        textList.sortDescending()
//
//        var result = ""
//
//        for (item in textList)
//        {
//            result += item
//        }
//
//        return result.toLong()
//    }
//
//    solution(118372)
}