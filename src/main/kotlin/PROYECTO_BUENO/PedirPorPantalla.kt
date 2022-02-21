package PROYECTO_BUENO

/**
 * @param PedirporPantalla pide al usuario datos que pasaran a formar parte del horario
 */
class PedirporPantalla() : LeerHorario {
    override fun dameHorario(): Horario {


        var horarioLleno = Horario()
        var salir = false

        do {
            var columna: String
            println("Escriba una columna para rellenar el horario, para terminar escriba en blanco")
            columna = readln()
            if (columna == "") {
                salir = true
            } else {
                 columna = columna.split(";").toString()
                horarioLleno.Horario.add(columna )

            }



        } while (salir == false)
       // println(horarioLleno.Horario)
        return horarioLleno


    }

    /**
     * @toString esta funcion devuelve el horario en string
     */
    override fun toString(): String {
        return dameHorario().Horario.toString()
    }
}
