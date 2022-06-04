import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList

fun main() {

    // 구간합 문제 (답은 맞는데 잘 안되네)
    val buffer : BufferedReader = BufferedReader(InputStreamReader(System.`in`))

    val inputArraySizeAndQuizSize = StringTokenizer(buffer.readLine(), " ")

    val arraySize = inputArraySizeAndQuizSize.nextToken().toInt()
    val quizSize = inputArraySizeAndQuizSize.nextToken().toInt()

//    println ("arraySize : " + arraySize)
//    println ("quizSize : " + quizSize)

//    val inputNumberArray = StringTokenizer(buffer.readLine(), " ")

    // 공백용
    val temp1 = buffer.readLine().split(" ").map {  }

    val numberArray = buffer.readLine().split(" ").map { it.toLong() }

//    for (index : Int in 0 until numberArray.size)
//    {
//        println ("numberArray : " + numberArray.get(index))
//    }

    var sumArray = mutableListOf<Long>()

    for (index : Int in 0 until numberArray.size)
    {
        if (index == 0)
        {
            sumArray.add(index, numberArray.get(index))
        }
        else
        {
            sumArray.add(index, sumArray.get(index-1) + numberArray.get(index))
        }

    }

    for (index : Int in 0 until sumArray.size)
    {
        println ("sumArray : " + sumArray.get(index))
    }


    val resultArray = mutableListOf<Long>()

    for (index : Int in 0 until quizSize)
    {
        // 공백용
        val numberArray = buffer.readLine().split(" ").map {  }

        val inputQuiz = StringTokenizer(buffer.readLine(), " ")

        val start = inputQuiz.nextToken().toInt()
        val end = inputQuiz.nextToken().toInt()
        val result = sumArray.get(end-1) - (if (start-2 >= 0) sumArray.get(start-2) else 0)

        resultArray.add(result)
    }

    for (index : Int in 0 until resultArray.size)
    {
        println(resultArray.get(index))
    }
}