package PROYECTO_BUENO

/**
 * la interfce pantalla sirve para que el usuario escriba por pantalla y lo que introduzca se formatee y quite ;
 */
interface pantalla {
    var forma: format
    fun pedircabecera(): List<String> {
        return forma.formateo("")

    }
}