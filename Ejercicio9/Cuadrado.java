package Ejercicio9;
public class Cuadrado extends Figura {

    // Variable que guarda el lado
    double lado;

    // Constructor que recibe el lado
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Implementamos el método de Figura
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}