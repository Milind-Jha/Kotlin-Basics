sealed class Network{
    data class Error(val errorText : String): Network()
    object Loading: Network()
    data class Loaded(val content : String): Network()
}
fun processNetworkState(state : Network){
    when(state){
        is Network.Error -> {
            println("Error : ${state.errorText}")}
        is Network.Loading ->{
            println(/* show progress bar */)
        }
        is Network.Loaded -> {
            println("Content : ${state.content}")
        }
    }
}
fun main(){
    val state: Network = Network.Error("Data not Loaded")
    processNetworkState(state)
}