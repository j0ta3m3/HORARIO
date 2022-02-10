class PedirporPantalla() : LeerHorario {
    override fun dameHorario(): Horario {


        var horarioLleno = Horario()

        do {
            var columna: String
            println("Escriba una columna para rellenar el horario, para terminar escribe end")
            columna = readln().split(";").toString()
            horarioLleno.añadir(columna)


        } while (!columna.equals("end") )
        return horarioLleno
    }
}