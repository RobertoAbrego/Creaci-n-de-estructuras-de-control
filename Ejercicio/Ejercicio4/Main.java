package Ejercicio.Ejercicio4;

public class Main {

    public static void main(String[] args) {

        // Creamos el arreglo de números
        int[] numeros = {2, 5, 8, 11, 4};

        // Creamos el objeto Validador
        Validador validador = new Validador();

        // Contamos los números pares
        int pares = validador.contarPares(numeros);

        // Mostramos el resultado
        System.out.println("Pares encontrados: " + pares);
    }
}
