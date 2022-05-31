package low

import java.util.Scanner;// in the top!

fun main ()
{
    val sc: Scanner = Scanner(System.`in`)
    val inputIndex = sc.nextLong()  // Long
    val inputAllData = sc.next()    // String
    var result = 0

    val list = inputAllData.toString().toCharArray()



    for (index : Int in 0 until list.size)
    {
//        println("index $index : ${list.get(index)}")

        result += list.get(index).toString().toInt()
    }

    println (result)
}