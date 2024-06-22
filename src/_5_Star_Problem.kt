fun main(){
//    question 1

    for (i in 1..4){
        for(i in 1..5){
            print("* ")
        }
        println()
    }

    println()
    
//    question 2

    for (i in 1..4){
        if(i == 1 || i ==4){
            for (i in 1..5){
                print("* ")
            }
            println()
        }
        else{
            for(i in 1..5){
                if(i == 1 || i == 5){
                    print("* ")
                }
                else{
                    print("  ")
                }
            }
            println()
        }
    }
}