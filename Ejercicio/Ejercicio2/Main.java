package Ejercicio.Ejercicio2;

public class Main {

    public static void main(String[] args) {

        // Creamos una cuenta con un saldo inicial
        CuentaAhorro cuenta = new CuentaAhorro(500.00);

        // Mostramos el saldo usando el getter
        System.out.println("Saldo: $" + cuenta.getSaldo());
    }
}
