import java.util.*
import kotlin.collections.ArrayList

fun main() {

    // 구간합 문제

    // 정수 하나 읽기
    val sc: Scanner = Scanner(System.`in`)
    val inputOriginal = sc.nextLine()  // Long
    sc.nextLine();  // Consume newline left-over
    print(" ")
    var inputNumberList = sc.nextLine().split(" ").map { it.toLong() }    // 수 리스트
    var inputNumberAddResultList = mutableListOf<Long>()    // 수 리스트의 구간합 리스트
    var resultList = mutableListOf<Long>()

    val inputNumber = inputOriginal.substring(0, inputOriginal.indexOf(" ")).toInt()
    val inputIndex = inputOriginal.substring(inputOriginal.indexOf(" ")+1, inputOriginal.length).toInt()

    var sectorList = mutableListOf<String>()
    var sectorStartList = mutableListOf<Int>()
    var sectorEndList = mutableListOf<Int>()

    // inputIndex 만큼 입력받기
    for (index : Int in 0 until inputIndex)
    {
        //print(" ")
//        sectorList.add(sc.nextLine())    // 수 리스트
        sectorStartList.add(sc.nextInt())
        sectorEndList.add(sc.nextInt())
    }

//    println("inputNumber (수의 갯수) : $inputNumber")
//    println("inputIndex (전체 처리할 횟수) : $inputIndex")

    for (index : Int in 0 until inputNumberList.size)
    {
//        println("inputNumberList (수 리스트) : ${inputNumberList.get(index)}")

            if (index == 0)
            {
                inputNumberAddResultList.add(inputNumberList.get(index))
            }
            else
            {
                inputNumberAddResultList.add(inputNumberAddResultList.get(index-1) + inputNumberList.get(index))
            }
    }

//    for (index : Int in 0 until inputNumberAddResultList.size)
//    {
//        println("inputNumberAddResultList (구간합 리스트) : ${inputNumberAddResultList.get(index)}")
//    }


    // 최종결과값 내기
    for (index : Int in 0 until sectorStartList.size)
    {
//        println("==================")
//        println("sectorList (구간합 리스트) : ${sectorList.get(index)}")

//        val start = sectorList.get(index).substring(0, sectorList.get(index).indexOf(" ")).toInt()
//        val end = sectorList.get(index).substring(sectorList.get(index).indexOf(" ")+1, sectorList.get(index).length).toInt()
        var result : Long = 0

//        println("start (구간합 시작) : " + sectorStartList.get(index) + " / " + inputNumberAddResultList.get(sectorStartList.get(index)-1))
//        println("end (구간합 종료) : " + sectorEndList.get(index) + " / " + inputNumberAddResultList.get(sectorEndList.get(index)-1))

        if (sectorStartList.get(index) == 1)
        {
            result = inputNumberAddResultList.get(sectorEndList.get(index)-1)
        }
        else
        {
            result = inputNumberAddResultList.get(sectorEndList.get(index)-1) - inputNumberAddResultList.get(sectorStartList.get(index)-2)
        }

//        println("result (구간합) : $result")

        println(result)
    }
}