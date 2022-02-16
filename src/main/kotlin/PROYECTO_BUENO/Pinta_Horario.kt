package PROYECTO_BUENO

import de.m3y.kformat.Table
import de.m3y.kformat.table


class PintaHorario(){

fun tablita(listita: Horario) {
    var h = table {
        header(listita.Horario[0])

        row(listita.Horario[1])
        row(listita.Horario[2])

        hints {
            //   alignment("A", Hints.Alignment.LEFT)
            //    precision("C", 2)
            //     postfix("C", "%")
            borderStyle = Table.BorderStyle.SINGLE_LINE
        }
    }.render(StringBuilder())
println(h)
}

}
