package Ejercicio9;

public class Circulo extends Figura {

    // Variable que guarda el radio
    double radio;

    // Constructor que recibe el radio
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementamos el método de Figura
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
