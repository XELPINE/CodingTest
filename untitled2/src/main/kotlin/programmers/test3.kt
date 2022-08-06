package programmers

fun main ()
{
    // 노드 데이터를 Array로 변환
    fun getConvertNodetoArray (node : String)
    {
        var tmpNode = node
        var resultArray = ArrayList<ArrayList<Int>>()

        // 맨 처음 p가 있다면, 모든색이 동일하지 않다.
        if (tmpNode.substring(0, 1).equals("p"))
        {

            tmpNode = tmpNode.substring(1, tmpNode.length)

            println(tmpNode)

            // 또다시 p가 등장한다면, 인덱스 별로 어레이를 만들어주면 된다.
            // 인덱스는 노드의 위치
            for (index : Int in 0 .. 3)
            {
                var nodeArray = ArrayList<Int>()

                // p로 시작하면 이후 4글자가 노드 정보다.
                if (tmpNode.substring(0, 1).equals("p"))
                {
                    println("$index 번 노드 : P로 시작  : $tmpNode")
                    val nodeData = tmpNode.substring(1, 5).toList()
                    tmpNode = tmpNode.substring(5, tmpNode.length)
                    println("$index 번 노드 : P로 시작 -> $nodeData")

                    for (index in 0 until nodeData.size)
                    {
                        // black
                        if (nodeData.get(index).toString().equals("b"))
                        {
                            println("$index 번 노드 : P로 시작 -> ${nodeData.get(index)} / (B)")
                            nodeArray.add(0)
                        }
                        // white
                        else
                        {
                            println("$index 번 노드 : P로 시작 -> ${nodeData.get(index)} / (W)")
                            nodeArray.add(1)
                        }
                    }

                    resultArray.add(nodeArray)
                }
                else
                {
                    println("$index 번 노드 : P로 시작안함 : $tmpNode")

                    val nodeData = tmpNode.substring(0, 1)

                    if (tmpNode.length > 1)
                        tmpNode = tmpNode.substring(1, tmpNode.length)

                    // black
                    if (nodeData.equals("b"))
                    {
                        nodeArray.add(0)
                        nodeArray.add(0)
                        nodeArray.add(0)
                        nodeArray.add(0)
                    }
                    // white
                    else
                    {
                        nodeArray.add(1)
                        nodeArray.add(1)
                        nodeArray.add(1)
                        nodeArray.add(1)
                    }

                    resultArray.add(nodeArray)
                }
            }

        }
        // p로 시작하지 않음 : 모든 노드가 같은 색임
        else
        {
            val blackAndWhite = if (node.equals("b")) 0 else 1

                for (index : Int in 0 .. 3)
                {
                    val blackArray = ArrayList<Int>()
                    blackArray.add(blackAndWhite)
                    blackArray.add(blackAndWhite)
                    blackArray.add(blackAndWhite)
                    blackArray.add(blackAndWhite)

                    resultArray.add(blackArray)
                }
        }
    }

//    getConvertNodetoArray("ppwwwbpbbwwbw")
    getConvertNodetoArray("b")
}