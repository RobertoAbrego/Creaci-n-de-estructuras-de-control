package Ejercicio5;

public class Principal {

    // Aquí comienza el programa
    public static void main(String[] args) {

        // Creamos un objeto de la clase Gato
        Gato gato = new Gato();

        // Gato puede usar dormir() porque lo heredó de Animal
        gato.dormir();

        // Llamamos al método propio de Gato
        gato.maullar();
    }
}
