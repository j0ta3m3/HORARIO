package PROYECTO_BUENO

class PedirporPantalla() : LeerHorario {
    override fun dameHorario(): Horario {


        var horarioLleno = Horario()
        var salir = false

        do {
            var columna: String
            println("Escriba una columna para rellenar el horario, para terminar escribe end")
            columna = readln()
            if (columna == "") {
                salir = true
            } else {
                columna.split(";").toString()

                println(horarioLleno)
            }


        } while (salir == false)
        return horarioLleno
        println(horarioLleno)

    }

    override fun toString(): String {
        return dameHorario().Horario.toString()
    }
}