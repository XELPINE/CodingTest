package programmers

fun main ()
{
    // 숫자의 자릿수 구하기
    fun getNumberSize (number: Int) : Int
    {
        var size = 0
        var tmpNumber = number

        while (tmpNumber > 0)
        {
            tmpNumber = tmpNumber / 10
            size++
        }

        println("getNumberSize : $size")

        return size
    }

    // 숫자 위치
    fun getNumberAt (num : Int, index : Int) : Int
    {
        if (index == 0)
            return num % 10

        val res = num / Math.pow(10.0, (getNumberSize(num)-index).toDouble())

        return res.toInt()
    }

    fun solution(number: Int): Int {

        var sum = 0 // 숫자 총 길이
        var i = 0   // 해당 위치에 존재하는 숫자

        // 실제 총길이와 숫자를 구함
        while (sum<number)
        {
            sum += getNumberSize(++i)
        }

        println("sum : $sum")

        // 총 길이와 숫자가 다르다면 해당 사이즈를 제거
        if (sum != number)
            sum -= getNumberSize(i)

        println("sum2 : $sum")

        println("i : $i")

        return getNumberAt(i, (number - sum))
    }



//    println(solution(25))
    println(solution(26))
//    println(solution(27))
}