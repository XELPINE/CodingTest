import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    // 1. 입출력은 bufferReader / bufferWriter 쓰자.
    // 2. 망할 println 버그는 인텔리제이에서만 발생한다.

    val CODING_MODE = false

    val bufferedReader: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    var bufferedWriter = System.out.bufferedWriter()






    //  숫자 하나 읽기
    val inputNumber = bufferedReader.readLine().toInt()

//    println("inputNumber : " + inputNumber)

    var resultCount = 1

    var startIndex = 1
    var endIndex = 1
    var sum = 1


    while (endIndex != inputNumber)
    {
        if (sum == inputNumber)
        {
            // 정답 카운트 증가
            resultCount++

            // 다음 인덱스
            endIndex++
            sum+=endIndex
        }
        // 합이 더 커졌다면
        else if (sum > inputNumber)
        {
            sum -= startIndex
            startIndex++
        }
        else if (sum < inputNumber)
        {
            endIndex++
            sum += endIndex
        }
    }

    println(resultCount)
}