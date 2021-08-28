enum class EnumClass (var symbol:String){ // Used to substitute a group of data to something corresponding to it
    IRON("Fe"),
    GOLD("Au"),
    SILVER("Ag"),
    COPPER("Cu"),
    Magnesium("Mg")
}
fun printMetalName(metal:EnumClass){
    println(metal.name)
}
fun main(){
    for(elements in EnumClass.values()){
        println("SYMBOL: ${elements.symbol} NAME: ${elements.name} ORDER: ${elements.ordinal}")
    }
    printMetalName(EnumClass.Magnesium)
}