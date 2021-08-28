import java.util.*

class Deck {


    var total:Int=52
    var deck=Array(4){BooleanArray(13)}


    fun remove(card:Int,suite:Char){
        total--
        deck[suite-'a'][card]=true
    }
    fun probability(card:Int):Int{
        var indeck =0
        for (i in 0..3){
            if (deck[i][card]==false){
                indeck++;
            }
        }
        var ans = ((indeck*1000)/total).toDouble()
        return(ans).toInt()

    }

}

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val deck = Deck()

    var x: Int = read.nextInt()
    while (x != -1) {
        when(x) {
            1 -> {
                val card: Int = read.nextInt()
                val suite: Char = read.next()[0]
                deck.remove(card, suite)
            }
            2 -> {
                val card: Int = read.nextInt()
                println(deck.probability(card))
            }
        }
        x = read.nextInt()
    }
}