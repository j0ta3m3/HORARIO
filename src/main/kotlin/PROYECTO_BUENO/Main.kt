package PROYECTO_BUENO


fun main() {

    var horario = PedirporPantalla().dameHorario()

    var pinta = PintaHorario()
    pinta.tabla(horario)

}
