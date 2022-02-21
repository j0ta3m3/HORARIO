package PROYECTO_BUENO

import de.m3y.kformat.Table.BorderStyle.Companion.NONE
import de.m3y.kformat.Table.BorderStyle.Companion.SINGLE_LINE
import java.time.LocalDateTime
import kotlin.math.max

/**
 * @param la clase Horario sirve para alamecnar los datos del horario en una lista mutable y tiene dos funciones.
 */
class Horario() {

    var Horario = mutableListOf<String>()

    var contador = 0

    /**
     * @param formateo elimina el punto y coma de la cadena string que se pasa por pantalla
     */
     fun formateo(formateo: String): List<String> {
        val lista: List<String> = formateo.split(";")
        return lista
    }

}
