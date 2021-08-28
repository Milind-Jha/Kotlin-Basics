sealed class Converter{
    data class ConversionError(val data:String):Converter()
    object ConvertedObj: Converter()
}

fun main() {

    val data: Converter= Converter.ConversionError("Can't be parsed")
            ConverterDisplay(data)

}

fun ConverterDisplay(data:Converter){

    when(data)
    {
        is Converter.ConversionError-> println("Can't be Converted: ${data}")
            is Converter.ConvertedObj-> println("Converted")

    }
}