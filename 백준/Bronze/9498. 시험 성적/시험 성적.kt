import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val input = BufferedReader(InputStreamReader(System.`in`))
    val score = input.readLine().toInt()
    when(score){
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        in 70..79 -> println("C")
        in 60..69 -> println("D")
        else -> println("F")
    }
}