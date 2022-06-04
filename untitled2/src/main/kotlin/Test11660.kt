import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random.Default.nextInt

fun main() {


//    var arr = Array<LongArray>(5, {LongArray(3)})

    val sc: Scanner = Scanner(System.`in`)
//    val buffer : BufferedReader = BufferedReader(InputStreamReader(System.`in`))

//    val inputArraySizeAndQuizSize = StringTokenizer(buffer.readLine(), " ")

    val arraySize = sc.nextInt()
    val quizSize = sc.nextInt()

//    println ("arraySize : " + arraySize)
//    println ("quizSize : " + quizSize)

    var arr = Array<LongArray>(arraySize+1, {LongArray(arraySize+1)})
    var arrTempSum = Array<LongArray>(arraySize+1, {LongArray(arraySize+1)})

    // 숫자 입력받기
    for (index : Int in 1 .. arraySize)
    {
        // 공백용
//        val temp1 = buffer.readLine().split(" ").map {  }
        // 공백용


//        val input = StringTokenizer(buffer.readLine(), " ")

        for (index1 : Int in 1 .. arraySize)
        {

            arr[index][index1] = sc.nextLong()
            arrTempSum[index][index1] = arrTempSum[index][index1-1] + arrTempSum[index-1][index1] - arrTempSum[index-1][index1-1] + arr[index][index1]
//            print(" ")
        }
    }

//    // 입력 테스트
//    for (index : Int in 1 .. arraySize)
//    {
//        var tempResult : String = ""
//        for (index1 : Int in 1 .. arraySize)
//        {
//            tempResult = tempResult + arr[index][index1].toString() + " "
//
////            println("arr[$index][$index1] : " + arr[index][index1])
//        }
//        println("arr : " + tempResult)
//    }

//    // 구간합리스트
//    // 숫자 입력받기
//    for (index : Int in 1 .. arraySize)
//    {
//        for (index1 : Int in 1 .. arraySize)
//        {
//            arrTempSum[index][index1] = arrTempSum[index][index1-1] + arrTempSum[index-1][index1] - arrTempSum[index-1][index1-1] + arr[index][index1]
//        }
//    }

//    // 입력 테스트
//    for (index : Int in 1 .. arraySize)
//    {
//        var tempResult : String = ""
//        for (index1 : Int in 1 .. arraySize)
//        {
//            tempResult = tempResult + arrTempSum[index][index1].toString() + " "
//
////            println("arr[$index][$index1] : " + arr[index][index1])
//        }
//        println("arrTempSum : " + tempResult)
//    }

//    val resultArray = mutableListOf<Long>()

    for (index : Int in 0 until quizSize)
    {
        val x1 = sc.nextInt()
        val y1 = sc.nextInt()
        val x2 = sc.nextInt()
        val y2 = sc.nextInt()
        val result = arrTempSum[x2][y2] - arrTempSum[x1-1][y2] - arrTempSum[x2][y1-1] + arrTempSum[x1-1][y1-1]

//        resultArray.add(result)

        println(result)
    }

//    for (index : Int in 0 until resultArray.size)
//    {
//        println(resultArray.get(index))
//    }
}