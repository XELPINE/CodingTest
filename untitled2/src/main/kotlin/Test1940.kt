import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    // 1. 입출력은 bufferReader / bufferWriter 쓰자.
    // 2. 망할 println 버그는 인텔리제이에서만 발생한다.

    val CODING_MODE = false

    val bufferedReader: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    var bufferedWriter = System.out.bufferedWriter()






    //  숫자 하나 읽기
    val arraySize = bufferedReader.readLine().toInt()
    if (CODING_MODE) print(" ")
    val targetNumber = bufferedReader.readLine().toInt()
    if (CODING_MODE) print(" ")
    var arrayNumber = bufferedReader.readLine().split(" ").map { it.toInt() }

    // 로그
//    println("arraySize : " + arraySize)
//    println("targetNumber : " + targetNumber)
//    for (index : Int in 0 until arrayNumber.size)
//    {
//        println("arrayNumber[$index] : " + arrayNumber.get(index))
//    }

    var resultCount = 0

    for (startIndex : Int in 0 until arrayNumber.size)
    {
        for (endIndex : Int in startIndex+1 until arrayNumber.size)
        {
            if (arrayNumber[startIndex] + arrayNumber[endIndex] == targetNumber)
            {
                resultCount++
                continue
            }
        }
    }

    println(resultCount)


//    var resultCount = 1
//
//    var startIndex = 1
//    var endIndex = 1
//    var sum = 1
//
//
//    while (endIndex != inputNumber)
//    {
//        if (sum == inputNumber)
//        {
//            // 정답 카운트 증가
//            resultCount++
//
//            // 다음 인덱스
//            endIndex++
//            sum+=endIndex
//        }
//        // 합이 더 커졌다면
//        else if (sum > inputNumber)
//        {
//            sum -= startIndex
//            startIndex++
//        }
//        else if (sum < inputNumber)
//        {
//            endIndex++
//            sum += endIndex
//        }
//    }
//
//    println(resultCount)
}