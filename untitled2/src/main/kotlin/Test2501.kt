fun main() {
    //println("Hello World! 2501")

    // 정수 하나 읽기
    val inputOriginal = readLine().toString()
    var resultList = mutableListOf<Int>()

    val inputNumber = inputOriginal.substring(0, inputOriginal.indexOf(" ")).toInt()
    val inputIndex = inputOriginal.substring(inputOriginal.indexOf(" ")+1, inputOriginal.length).toInt()

    //println("inputNumber : $inputNumber")
    //println("inputIndex : $inputIndex")


    for (index : Int in 1 .. inputNumber)
    {
        if (inputNumber % index == 0)
        {
            //println("%0 : $index")
            resultList.add(index)
        }
    }

    //println("resultList.size : ${resultList.size}")

    if (resultList.size > 0 && (resultList.size >= (inputIndex))) {
        println(resultList.get(inputIndex - 1))
    }
    else
    {
        println("0")
    }


}