public class Ejercici6 {

    public static void main(String[] args) {

        // El contador comienza en 1
        int contador = 1;

        // La variable suma comienza en 0
        // Aquí se guardará el resultado de todas las sumas
        int suma = 0;

        // El ciclo se repite mientras el contador sea menor o igual a 100
        while (contador <= 100) {

            // Suma el número actual del contador
            // y guarda el resultado en la variable suma
            suma = suma + contador;

            // Aumenta el contador de uno en uno
            contador++;
        }
        // Muestra el resultado final en la consola
        System.out.println("La suma es: " + suma);
    }
}
