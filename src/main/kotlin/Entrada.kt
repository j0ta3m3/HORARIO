/**
/**
 * Entrada
 *
 * @constructor hay dos variables. La primera lee la cabecera del horario, la segunda lee los datos para cada celda del horario
 */

open class PedirPantalla: Horariox() {
    var cabecera : Cabecera = Cabecera()
    open   fun pedircabecera() : List<String> {
        println("Porfavor introduzca la cabecera del horario separando los elementos por ;")
        return  cabecera.formateo(readln())


        println("Porfavor introduzca una linea del horario separando los elementos por ; para terminar introduzca un valor en blanco")




    }

}


 */