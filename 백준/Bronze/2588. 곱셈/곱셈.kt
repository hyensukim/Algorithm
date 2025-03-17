import java.io.IOException
import java.io.InputStreamReader
import java.io.BufferedReader

fun main(){
    val reader = System.`in`.bufferedReader()
    val n1 = reader.readLine().toInt()
    val n2 = reader.readLine()

    val res1 = n1 * ("${n2[2]}".toInt())
    val res2 = n1 * ("${n2[1]}".toInt())
    val res3 = n1 * ("${n2[0]}".toInt())

    println(res1)
    println(res2)
    println(res3)
    println(res1 + (res2 * 10) + (res3 * 100))
}