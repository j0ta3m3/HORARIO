/**
 * Formato linea
 *
 * @constructor usando el import de kformat, crea el horario.
 * La variable se le pasa el horario y el split ; corta la entrada y pasa a la siguiente "celda" del horario
 */


open  class Formatolinea() {
    var delimitacion = ";"

    open fun formateo(formateo: String): List<String> {
        return formateo.split(delimitacion)
    }

}
