import java.util.Scanner

fun main(){
    var a: Int = 5

    val scan = Scanner(System.`in`)
    a=scan.nextInt()
    while (a<10){
        println(a)
        a++
    }
    println()
    do {
        println(a)
    }while (a<10)
}