import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main(){
    val input = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(input.readLine())
    val sub = token.nextToken().toInt() - token.nextToken().toInt()
    if(sub > 0) println(">") else if(sub == 0) println("==") else println("<")
}