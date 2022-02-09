package PROYECTO_BUENO

/**
 * la interface format tiene una función para cuando salga en la línea ; se corta.
 */
interface format {

        fun formateo(formateo: String): List<String> {
            var delimitacion: String = ";"
            return formateo.split(delimitacion)
        }


}