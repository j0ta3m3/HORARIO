package PROYECTO_BUENO

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

            println(horarioLleno.Horario)

        } while (salir == false)
        return horarioLleno


    }

    override fun toString(): String {
        return dameHorario().Horario.toString()
    }
}
