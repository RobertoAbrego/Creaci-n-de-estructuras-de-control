package Ejercicio.Ejercicio7;

public class Principal {
    public static void main(String[] args) {
        GestorConexion c1 = GestorConexion.obtener();
        GestorConexion c2 = GestorConexion.obtener(); // Obtención de la segunda instancia

        System.out.println("Son la misma conexion: " + (c1 == c2));
    }// Cierre del método main
}