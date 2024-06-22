fun main(){
    var arr = mutableListOf(1,2,3,4,5,6,7,"8","9","10")
//    var arr = listOf(1,2,3,4,5,6,7,"8","9","10")
//    var arr = arrayOf(1,2,3,4,5,6,7,"8","9","10")

    arr.addFirst(0)

    for(i in arr){
        println(i)
    }

}