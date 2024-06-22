import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    print("Enter the number: ")
    val num = sc.nextInt()

    for (i in 1..10){
        val res = num * i
        println("$num X $i = $res")
    }
}