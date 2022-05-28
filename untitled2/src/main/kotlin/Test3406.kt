import java.util.*
import kotlin.random.Random.Default.nextInt

fun main() {

    val sc: Scanner = Scanner(System.`in`)

    val inputAllIndex = sc.nextInt()
    var readNumberList = mutableListOf<Int>()
    var numberBinaryList = mutableListOf<String>()

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
        numberBinaryList.add(inputNumber.toString(2).reversed())
    }

//    for (index : Int in 0 until readNumberList.size)
//    {
//        println("inputNumber : ${readNumberList.get(index)}")
//        println("numberBinaryList : ${numberBinaryList.get(index)}")
//    }

    for (index : Int in 0 until readNumberList.size)
    {
        var result : String = ""

        if (index+1 > numberBinaryList.size) return



        for (stringIndex : Int in 0 until numberBinaryList.get(index).length)
        {
//            println("sub : ${numberBinaryList.get(index).substring(stringIndex, stringIndex+1)}")

            if (numberBinaryList.get(index).substring(stringIndex, stringIndex+1).equals("1"))
            {
                if (result.equals(""))
                {
                    result = stringIndex.toString()
                }
                else
                {
                    result = result + " " + stringIndex
                }

            }
        }


        println("$result")
    }






}