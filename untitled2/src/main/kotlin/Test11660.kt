import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    // 1. 입출력은 bufferReader / bufferWriter 쓰자.
    // 2. 망할 println 버그는 인텔리제이에서만 발생한다.

    val CODING_MODE = false

    val bufferedReader : BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    var bufferedWriter = System.out.bufferedWriter()

//    val inputArraySizeAndQuizSize = StringTokenizer(buffer.readLine(), " ")

    val (arraySize, quizSize) = bufferedReader.readLine().split(' ').map { it.toInt() }

//    val arraySize = inputArraySizeAndQuizSize.nextToken().toInt()
//    val quizSize = inputArraySizeAndQuizSize.nextToken().toInt()

//    println ("arraySize : " + arraySize)
//    println ("quizSize : " + quizSize)

    var arr = Array(arraySize+1, {LongArray(arraySize+1)})
    var arrTempSum = Array(arraySize+1, {LongArray(arraySize+1)})

    if (CODING_MODE) print(" ")

    // 숫자 입력받기
    for (index : Int in 1 .. arraySize)
    {
        val elements = bufferedReader.readLine().split(" ").map { it.toInt() }

        for (index1 : Int in 1 .. arraySize)
        {

            arr[index][index1] = elements.get(index1-1).toLong()
            arrTempSum[index][index1] = arrTempSum[index][index1-1] + arrTempSum[index-1][index1] - arrTempSum[index-1][index1-1] + arr[index][index1]

            if (CODING_MODE) print(" ")
        }

//        val input = StringTokenizer(buffer.readLine(), " ")
//
//        for (index1 : Int in 1 .. arraySize)
//        {
//
//            arr[index][index1] = input.nextToken().toLong()
//            arrTempSum[index][index1] = arrTempSum[index][index1-1] + arrTempSum[index-1][index1] - arrTempSum[index-1][index1-1] + arr[index][index1]
//            print(" ")
//        }
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


    for (index : Int in 0 until quizSize)
    {
        val (x1, y1, x2, y2) = bufferedReader.readLine().split(' ').map { it.toInt() }
        val result = arrTempSum[x2][y2] - arrTempSum[x1-1][y2] - arrTempSum[x2][y1-1] + arrTempSum[x1-1][y1-1]

        if (CODING_MODE) print(" ")

//        println(result)
        bufferedWriter.write(result.toString())
        bufferedWriter.newLine()
    }

    bufferedWriter.flush()
    bufferedReader.close()
}