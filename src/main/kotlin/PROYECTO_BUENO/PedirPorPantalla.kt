package PROYECTO_BUENO

/**
 * @param PedirporPantalla pide al usuario datos que pasaran a formar parte del horario
 */
class PedirporPantalla() : LeerHorario {
    override fun dameHorario(): Horario {

        var horarioLleno = Horario()
        var salir = false


        do {
            println("Escriba una columna para rellenar el horario, para terminar escriba en blanco")

            var columna: String = readln()

            if (columna == "") {
                salir = true
            } else {
                var columna1 = columna.split(";")
                horarioLleno.Horario.add(columna1)

            }

        } while (salir == false)

        return horarioLleno


    }

    /**
     * @toString esta funcion devuelve el horario en string
     */
    override fun toString(): String {
        return dameHorario().Horario.toString()
    }
}
