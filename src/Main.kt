fun main() {
    println("Hello World!")
    val numbers = intArrayOf(1,2,13,4)
    var biggest = numbers[0]

    for (num in numbers){
        if(num>biggest){
            biggest = num
        }
    }
    println(biggest)
}