package Ejercicio.Ejercicio2;

// Clase que representa una cuenta de ahorro
public class CuentaAhorro {

    // Saldo privado, solo se puede acceder mediante el getter
    private double saldo;

    // Constructor que inicializa el saldo
    public CuentaAhorro(double saldo) {
        this.saldo = saldo;
    }

    // Getter para consultar el saldo
    public double getSaldo() {
        return saldo;
    }
}
