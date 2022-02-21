package PROYECTO_BUENO


fun main() {

    fun splitLista(listaMutable: Unit): Array<String> {

        var hola = listaMutable.toString()
        var hola2 = hola.split(",").toTypedArray()
        return hola2

    }

    var patata = PedirporPantalla()
    var patata2= PintaHorario().tablita(patata.dameHorario())
    patata2


}
