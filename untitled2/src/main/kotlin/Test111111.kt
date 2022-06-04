import java.io.BufferedReader
import java.io.BufferedWriter

private lateinit var bufferedReader: BufferedReader
private lateinit var bufferedWriter: BufferedWriter

fun main() {
    bufferedReader = System.`in`.bufferedReader()
    bufferedWriter = System.out.bufferedWriter()

    // 1. get (n, m)
    val (n, m) = bufferedReader
        .readLine()
        .split(" ")
        .map { it.toInt() }

    // 2. create (n + 1) x (n + 1) data structure (Array<MutableList<Int>>)
    val table = Array(n + 1) { mutableListOf(0) }

    // 3. get elements
    repeat(n) { index ->
        val elements = bufferedReader
            .readLine()
            .split(" ")
            .map { it.toInt() }
        table[index + 1].addAll(elements)
    }

    // 4. create cumulative sum data structure
    val sum = Array(n + 1) { Array(n + 1) { 0 } }

    // 5. set row cumulative sum
    for (i in 1..n) {
        for (j in 1..n) {
            sum[i][j] = sum[i][j - 1] + sum[i - 1][j] - sum[i - 1][j - 1] + table[i][j]
        }
    }

    // 6. get (x1, x2), (y1, y2)
    repeat(m) {
        val (x1, y1, x2, y2) = bufferedReader
            .readLine()
            .split(" ")
            .map { it.toInt() }

        // 7. get cumulative sum
        bufferedWriter.write("${sum[x2][y2] - sum[x1 - 1][y2] - sum[x2][y1 - 1] + sum[x1 - 1][y1 - 1]}\n")
    }

    bufferedReader.close()
    bufferedWriter.close()
}