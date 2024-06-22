fun main() {
//    question 1

//    val num = 4
//    var i = 1
//    while (i <= num){
//        var j = 1
//        while(j<=i){
//            print("* ")
//            j++
//        }
//        println()
//        i++
//    }

//    question 2

    val n = 4
    var i = 1
    while (i <= n){
        var j = 4
        i = i-1
        while(j!=i){
            print("* ")
            j--
        }
        println()
        i += 2
    }
}