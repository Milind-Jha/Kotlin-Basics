fun main(){
    var rating: Int? = 5;
    val result = when (rating){
        5-> "Awesome"
        4,3 -> "good"
        2,1 -> "poor"
        else -> {
            println("No rating")
            "Zero"
        }
    }
    println("The rating is $result")

    if (rating== 5){
        println("Awesome")
    }
    else if (rating==4||rating==3){
        println("good")
    }
    else{
        println("poor")
    }

    if (4 !in 5..10){
        println("I am not there")
    }
}