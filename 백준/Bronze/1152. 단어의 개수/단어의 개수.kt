import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val input = BufferedReader(InputStreamReader(System.`in`))
    val line = input.readLine().trim()
    val wordList = line.split(" ")
    if(wordList.size == 1) if(wordList[0].isBlank()) println(0) else println(1) 
    else println(wordList.size)
}