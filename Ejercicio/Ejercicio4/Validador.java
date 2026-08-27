package Ejercicio.Ejercicio4;

// Clase que valida números
public class Validador {

    // Método privado que verifica si un número es par
    private boolean esPar(int n) {
        return n % 2 == 0;
    }

    // Método público que cuenta los números pares
    public int contarPares(int[] numeros) {

        int contador = 0;

        // Recorremos todos los números
        for (int numero : numeros) {

            // Usamos el método privado
            if (esPar(numero)) {
                contador++;
            }
        }

        return contador;
    }
}
