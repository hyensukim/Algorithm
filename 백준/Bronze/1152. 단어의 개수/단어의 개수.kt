import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main(){
    val input = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(input.readLine())
    print(token.countTokens())
}