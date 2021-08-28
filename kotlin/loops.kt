

fun main(){
        var a = arrayOf("Arthur","morgan","Dutch","van der lin")
        for (q in a){
            print(q+" ")
        }
    println()
        for (q in a.iterator()){
            print(q+" ")
        }
    println()
        for( q in a.indices){
            print(a[q]+" ")
        }
    println()
        for (i in 1..5){
            print("${i} ")
        }
    println()
        for (i in 1..5 step 2){
            print("${i} ")
        }
    println("Line")
        for (i in 1 until 5 ){ // 1 to 4 only, 5 skipped
            print(i)
        }
    println()
        for (i in 5 downTo 1 ){
            print(i)
        }
    println()
        for (i in 1..5){
            if (i ==3){
                continue
            }
            print(2*i)
        }

}