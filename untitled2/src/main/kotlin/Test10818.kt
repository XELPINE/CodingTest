import java.util.*
import kotlin.random.Random.Default.nextInt

fun main() {

    val sc: Scanner = Scanner(System.`in`)

    val inputAllIndex = sc.nextInt()
    var readNumberList = mutableListOf<Int>()
    var numberBinaryList = mutableListOf<Int>()

//    // 정수 하나 읽기5
//    val inputOriginal = nextInt().toString()
//    var resultList = mutableListOf<Int>()
//
//    val inputNumber = inputOriginal.substring(0, inputOriginal.indexOf("\n")).toInt()
//    val inputIndex = inputOriginal.substring(inputOriginal.indexOf("\n")+1, inputOriginal.length).toInt()
//

    for (index : Int in 0 until inputAllIndex)
    {
        val inputNumber = sc.nextInt()

        readNumberList.add(inputNumber)
        numberBinaryList.add(inputNumber)
    }

//    println("min : " + numberBinaryList.minOrNull() ?: 0)
//    println("max : " + numberBinaryList.maxOrNull() ?: 0)

    print((numberBinaryList.minOrNull() ?: 0).toString() + " " + numberBinaryList.maxOrNull() ?: 0)




}