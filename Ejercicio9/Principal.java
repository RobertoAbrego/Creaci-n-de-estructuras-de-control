package Ejercicio9;

public class Principal {

    // Aquí comienza el programa
    public static void main(String[] args) {

        // Creamos un círculo con radio 3
        Circulo circulo = new Circulo(3);

        // Creamos un cuadrado con lado 5
        Cuadrado cuadrado = new Cuadrado(5);

        // Mostramos el área del círculo
        System.out.println("Area circulo: " + circulo.calcularArea());

        // Mostramos el área del cuadrado
        System.out.println("Area cuadrado: " + cuadrado.calcularArea());
    }
}