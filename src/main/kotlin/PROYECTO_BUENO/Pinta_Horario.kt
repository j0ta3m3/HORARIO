package PROYECTO_BUENO

import de.m3y.kformat.Table
import de.m3y.kformat.table


class PintaHorario(array: Array<String>){


    var h = table {
        header(array[0])

        row(array[1])
        row(array[2])

        hints {
            //   alignment("A", Hints.Alignment.LEFT)
            //    precision("C", 2)
            //     postfix("C", "%")
            borderStyle = Table.BorderStyle.SINGLE_LINE
        }
    }.render(StringBuilder())



}
