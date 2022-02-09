package PROYECTO_BUENO
import PROYECTO_BUENO.format

open class Horario:format{

    var Horario = mutableListOf<String>()

    fun añadir ( añade : List<String> ){
        Horario.addAll(añade)
    }
}

