package Ejercicios.Ejercicio6;

public class Cuenta {
    private String titular;
    private double saldo;

    // Constructor 1: Recibe solo el titular (inicia el saldo en 0)
    public Cuenta(String titular) {
        this.titular = titular;
        this.saldo = 0.0; // Inicializa el saldo en 0
    }

    // Constructor 2: Recibe titular y saldo inicial (sobrecarga)
    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + this.titular + " | Saldo: $" + this.saldo);
    }

    public static void main(String[] args) {
        // Uso del primer constructor (saldo 0)
        Cuenta cuenta1 = new Cuenta("Carlos Pérez");

        // Uso del segundo constructor (titular y saldo)
        Cuenta cuenta2 = new Cuenta("Ana Gómez", 1250.50);

        // Impresión de datos
        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
    }
}