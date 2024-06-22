var arr = mutableListOf(0,1)
fun nextNum(num1 : Int, num2 : Int) : Int {
    return num1+num2
}
fun formArray(num : Int){
    var i = 1
    while (i<=num){
        val a = arr.count()
        arr.add(nextNum(arr[a-2],arr[a-1]))
        i++
    }
}
fun main(){
    formArray(10)
    for(i in arr){
        print("$i ")
    }
}