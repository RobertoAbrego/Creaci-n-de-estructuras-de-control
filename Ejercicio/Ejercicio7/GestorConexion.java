package Ejercicio.Ejercicio7;

public class GestorConexion {
    private static GestorConexion instancia;

    private GestorConexion() {} // Cierre del constructor privado

    public static GestorConexion obtener() {
        if (instancia == null) {
            instancia = new GestorConexion();
        } // Cierre del if
        return instancia;
    } // Cierre del método obtener
}