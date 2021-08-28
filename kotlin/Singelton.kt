object GameScore{
    var score: Int = 0
        private set

    fun addScore(point: Int): Int{
        if(point > 0) {
            this.score += point
        }
        return score
    }
}

class Child(val name: String){
    //companion object
    companion object {
        const val schoolName = "DP School"
    }
}

fun main(){
    GameScore.addScore(10)
    println ("The score is ${GameScore.score}")

    println ("The score is ${Child.schoolName}")
}
