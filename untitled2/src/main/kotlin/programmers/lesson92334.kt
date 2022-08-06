package programmers

fun main()
{

    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        var answer = mutableListOf<Int>()

        // 나를 신고한 사용자들의 리스트 : 신고당한아아디, 신고한사람 리스트
        var reportedMap = HashMap<String, HashSet<String>>()
        // 신고자 메일 카운트
        var answerMap = HashMap<String, Int>()

        // 신고자 리스트 초기화
        for (index : Int in 0 until id_list.size)
        {
            reportedMap.put(id_list.get(index), HashSet<String>())
            answerMap.put(id_list.get(index), 0)
        }

        // 신고한 사람 리스트를 값에 넣기
        for (index : Int in 0 until report.size)
        {
            var reportId = report.get(index).split(" ").get(0)      // 신고한사람
            var reportedId = report.get(index).split(" ").get(1)    // 신고당한사람

            reportedMap.get(reportedId)?.add(reportId)
        }

        for (index : Int in 0 until id_list.size)
        {
            if (reportedMap.get(id_list.get(index))?.size!! >= k)
            {
                for (reportId in reportedMap.get(id_list.get(index))!!.iterator())
                {
                    //answerMap.get(reportId)?.toInt()?.plus(1)
//                    println("신고당한 사람 : ${id_list.get(index)} / 신고한사람 : $reportId")
                    answerMap.put(reportId, answerMap.get(reportId)!!.toInt().plus(1))
                }
            }
        }

        for (index : Int in 0 until id_list.size)
        {
            answerMap.get(id_list.get(index))?.let { answer.add(index, it) }
        }




        return answer.toIntArray()
    }





    val resultList = solution(arrayOf("muzi", "frodo", "apeach", "neo"), arrayOf("muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"), 2)

    for (index : Int in 0 until resultList.size)
    {
        print(resultList.get(index))
    }
}