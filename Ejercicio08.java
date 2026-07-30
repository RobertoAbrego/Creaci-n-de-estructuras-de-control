public class Ejercicio08 {
    public static void main(String[] args) {
        // Calcular el factorial de un número
        int n = 6;
        int factorial = 1;
        // Se declara una variable entera llamada "n" y se inicializa con el número para el cual se desea calcular el factorial
        // Se declara una variable entera llamada "factorial" y se inicializa con 1

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }// Se utiliza un bucle for para iterar desde 1 hasta n, multiplicando el valor actual de "factorial" 
        // por el valor de "i" en cada iteración

        System.out.println("El factorial de " + n + " es " + factorial);
        // Se imprime el resultado del cálculo del factorial
    }
}