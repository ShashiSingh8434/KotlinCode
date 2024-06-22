import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    var run = true

    while(run){
        println("""Enter the option:
        1. Addition
        2. Subtraction
        3. Multiplication
        4. Division
        5. Quit
        """.trimMargin())
        val opt = sc.nextInt()

        print("Enter num1 : ")
        val num1 = sc.nextInt()

        print("Enter num2 : ")
        val num2 = sc.nextInt()

        when(opt) {
            1 -> println(num1 + num2)
            2 -> println(num1 - num2)
            3 -> println(num1 * num2)
            4 -> println(num1 / num2)
            5 -> run = false
        }
    }
}