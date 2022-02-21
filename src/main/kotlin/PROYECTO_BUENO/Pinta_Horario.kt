package PROYECTO_BUENO

import de.m3y.kformat.Table
import de.m3y.kformat.table

/**
 * @param PintaHorrio tiene una única función que crea la tabla
 */
class PintaHorario() {

    /**
     * @param tablita crea una tabla con formato, crea la cabecera y cada una de las columnas separadas por ||
     */
    fun tabla(lista: Horario) {
        var h = table {
            header(lista.Horario[0])
            lista.Horario.removeAt(0)
            for (i in lista.Horario.indices) {
                row(lista.Horario[i])
            }

            hints {
                borderStyle = Table.BorderStyle.SINGLE_LINE
            }
        }.render(StringBuilder())
        println(h)
    }

}
