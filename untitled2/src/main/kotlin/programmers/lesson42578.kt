package programmers

fun main()
{
    // https://school.programmers.co.kr/learn/courses/30/lessons/42578?language=kotlin

    tailrec fun factorial(n: Int, acc: Int): Int {
        return if (n <= 0) {
            acc
        } else {
            factorial(n-1, n*acc)
        }
    }

    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1

        // string, hashmap 구성으로 headgear등의 위치를 key, 앞의 품멱을 value로 하여 각 부위별 갯수 파악하면?
        var itemList = HashMap<String, HashSet<String>>()

        clothes.groupBy { it[1] }.values.fold(1, { acc, v -> acc * (v.size + 1) })

        for (index : Int in 0 until clothes.size)
        {
            val itemType = clothes.get(index).get(1)
            val itemName = clothes.get(index).get(0)

            // 해당 타입의 값이 없다면 추가
            if (itemList.containsKey(itemType) == false)
            {
                itemList.put(itemType, HashSet<String>())
                itemList.get(itemType)?.add(itemName)
            }
            // 있다면 hashset만 추가
            else
            {
                itemList.get(itemType)?.add(itemName)
            }

        }

        var maxCount = 0

        for (item in itemList.values)
        {
            println(item.size)

            answer *= item.size+1
        }

        return answer-1
    }



    val resultList = solution(arrayOf(
        arrayOf("yellow_hat", "headgear"),
        arrayOf("blue_sunglasses", "eyewear"),
        arrayOf("green_turban", "headgear")
    ))
}