import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val input = BufferedReader(InputStreamReader(System.`in`))
    val S = input.readLine()
    val alphabets = Array(26){-1}
    var index = 0
    for(c in S.toCharArray()){
        if(alphabets[c.code-97] == -1) alphabets[c.code-97] = index
        index++
    }
    alphabets.forEach{
        v -> print("$v ")
    }
}