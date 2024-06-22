import java.util.Scanner
val sc = Scanner(System.`in`)

fun menu():Int{

    print("""
1. Addition
2. Subtraction
3. Multiplication
4. Division
Enter the option: """.trimMargin())

    return sc.nextInt()
}

fun getNum1():Int{
    print("Enter num1 : ")
    return sc.nextInt()
}

fun getNum2():Int{
    print("Enter num2 : ")
    return sc.nextInt()
}

fun calculate(operation : Int, num1 : Int, num2 : Int){
    val result = when(operation){
                    1 -> num1+num2
                    2 -> num1-num2
                    3 -> num1*num2
                    4 -> num1/num2
                    else -> "Invalid"
                }
    println("The result is: " + result)
}
fun main(){
        calculate(menu(), getNum1(), getNum2())
}