package Ejercicios.Ejercicio2;

public class Circulo {

    // Atributo que almacenará el radio del círculo
    double radio;

    // Constructor que recibe el radio como parámetro
    public Circulo(double radio) {

        // this.radio se refiere al atributo de la clase
        // radio se refiere al parámetro recibido
        this.radio = radio;
    }

    // Método que calcula y devuelve el área del círculo
    public double area() {

        // Calculamos el área usando la fórmula:
        // π × radio × radio
        return Math.PI * radio * radio;
    }
}
