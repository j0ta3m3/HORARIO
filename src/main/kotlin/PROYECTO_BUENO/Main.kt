package PROYECTO_BUENO


fun main() {

    fun splitLista(listaMutable: Unit): Array<String> {

        var hola = listaMutable.toString()
        var hola2 = hola.split(",").toTypedArray()
        return hola2

    }

    /* val string = "123-654321"
     val parts = string.split("-").toTypedArray()
     val part1 = parts[0] // 123
     val part2 = parts[1] // 654321*/


    var patata = PedirporPantalla()
    var patata2= splitLista(PintaHorario().tablita(patata.dameHorario()))
    patata2


}
