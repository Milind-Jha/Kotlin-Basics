open class Vehicle{
    open fun startEngine(){
        println("Press the start button")
    }
}
class BMWCAR (): Vehicle(){
    override fun startEngine() {
        println("BMW\npress the button on key to open the gate")
        super.startEngine()
    }
}

class AUDI () : Vehicle(){
    override fun startEngine() {
        println("AUDI\nInsert the key to open the gate")
        super.startEngine()
    }
}
fun startBMWCAR(bmwcar: BMWCAR){
    bmwcar.startEngine()
}
fun startAUDICAR(audi: AUDI){
    audi.startEngine()
}
fun startVEHICLE(vehicle: Vehicle){
    vehicle.startEngine()
}

fun main(){
    val bmwcar: BMWCAR = BMWCAR()
    startBMWCAR(bmwcar)

    val audi: AUDI = AUDI()
    startAUDICAR(audi)

    val  bmwcar2: Vehicle = BMWCAR()
    startVEHICLE(bmwcar2)    //OUTPUT SAME AS LINE 31

    val audi2: Vehicle = AUDI()
    startVEHICLE(audi2)     //OUTPUT SAME AS LINE 34

    println()
    val vehicle: Vehicle = Vehicle()
    startVEHICLE(vehicle)
}