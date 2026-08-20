package Ejercicios.Ejercicio2;

public class Principal {

    // Punto de inicio del programa
    public static void main(String[] args) {

        // Creamos un objeto Circulo y le damos un radio de 2
        Circulo circulo = new Circulo(2);

        // Llamamos al método area() y mostramos el resultado
        System.out.println("Area: " + circulo.area());
    }
}