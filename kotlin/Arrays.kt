import java.io.File.separator

fun main(){
//    var arr = arrayOf(2,3,1,4,5)
//    println("Number at pos 2 is ${arr.get(1)}")
//    println("Number at third pos is ${arr[2]}")
//
//    arr.set(0,20)
//    arr[1]=30
//
//    println(arr.joinToString(","))
//
//    var arr2= Array(5){0}
//    println(arr2.joinToString(" "))

    var arr3  = Array(5){i -> (i+1).toString()}
    arr3.set(4, "6")
    arr3.forEach{ print("${it}, ")}

    println()
    var TwoDarr = Array(2){IntArray(4)}// same as int[][] TwoDarr = new int[2][4]
    for ( i in 0..1){
        for (j in 0 ..3){
            print(TwoDarr[i][j] )
            print("\t")
        }
        println()
    }
}