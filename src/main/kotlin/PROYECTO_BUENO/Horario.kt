package PROYECTO_BUENO

import de.m3y.kformat.Table.BorderStyle.Companion.NONE
import de.m3y.kformat.Table.BorderStyle.Companion.SINGLE_LINE
import java.time.LocalDateTime
import kotlin.math.max

class Horario():format{

    var Horario = mutableListOf<String>()

    var contador = 0

    override fun formateo(formateo: String): List<String> {
        var lista: List<String> = formateo.split(";")
        return lista
    }



    fun pedir() {

        do{
            println("Introduzca un horario")
            var entrada = readln()
           var dato= Horario().formateo(entrada)
            Horario().Horario.add(dato.toString())
            contador++

        } while (!entrada.isNullOrBlank())

    }

}
