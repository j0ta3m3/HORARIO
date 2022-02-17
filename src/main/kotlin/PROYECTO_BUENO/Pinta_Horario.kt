package PROYECTO_BUENO

import de.m3y.kformat.Table
import de.m3y.kformat.table


class PintaHorario() {

    fun tablita(listita: Horario) {
        var h = table {
            header(listita.Horario[0])
            listita.Horario.removeAt(0)
            for (i in listita.Horario.indices) {
                row(listita.Horario[i])
            }

            hints {
                borderStyle = Table.BorderStyle.SINGLE_LINE
            }
        }.render(StringBuilder())
        println(h)
    }

}
