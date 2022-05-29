package low
import java.util.*
import kotlin.collections.ArrayList

fun main ()
{
    //입력
    val sc: Scanner = Scanner(System.`in`)
    val inputIndex = sc.nextLong()  // Long
    sc.nextLine();  // Consume newline left-over
    print(" ")
    var inputAllData = sc.nextLine().split(" ").map { it.toLong() }    // String


    var resultTempList = mutableListOf<Double>()
    var result = 0





//    println("inputIndex : " + inputIndex)
//    println("inputAllData : " + inputAllData)
//
//    for (index : Int in 0 until inputIndex.toInt())
//    {
//        println("inputAllData $index : " + inputAllData.get(index))
//    }
//
//    println("inputAllData maxOrNull : " + inputAllData.maxOrNull())
//    println("inputAllData sum : " + inputAllData.sum())


    var sum : Double = 0.0

    for (index : Int in 0 until inputAllData.size)
    {
//        println ("ddd : " + (inputAllData.get(index) / inputAllData.maxOrNull()!!.toDouble() * 100.0))

        resultTempList.add(index, (inputAllData.get(index) / inputAllData.maxOrNull()!!.toDouble() * 100.0))

        sum += resultTempList.get(index)
    }

    //println(sum)
    println(sum / inputIndex)





//    for (index : Int in 0 until list.size)
//    {
//        println("index $index : ${list.get(index)}")
//
////        result += list.get(index).toString().toInt()
//    }

//    println (result)
}