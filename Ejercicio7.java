public class Ejercicio7 {

    public static void main(String[] args) {

        // La variable comienza con el número 5
        int numero = 5;

        // El código dentro de do se ejecuta al menos una vez
        do {

            // Muestra el número actual en la consola
            System.out.println(numero);

            // Suma 5 al número en cada vuelta
            // Ejemplo: 5, 10, 15, 20...
            numero = numero + 5;

        // El ciclo continúa mientras el número sea menor o igual a 50
        } while (numero <= 50);
    }
}