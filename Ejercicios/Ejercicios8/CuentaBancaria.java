package Ejercicios.Ejercicios8;

public class CuentaBancaria {
    private double saldo;

    // Constructor para inicializar la cuenta con un saldo
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método estático que recibe el objeto por referencia y modifica su saldo
    public static void depositar(CuentaBancaria c, double monto) {
        if (c != null && monto > 0) {
            c.saldo += monto;
        }
    }

    public static void main(String[] args) {
        // 1. Crear un objeto CuentaBancaria con saldo inicial de 100
        CuentaBancaria miCuenta = new CuentaBancaria(100.0);
        System.out.println("Saldo inicial: $" + miCuenta.getSaldo());

        // 2. Depositar 50 usando el método estático
        CuentaBancaria.depositar(miCuenta, 50.0);

        // 3. Mostrar el saldo actualizado
        System.out.println("Saldo después del depósito: $" + miCuenta.getSaldo());
    }
}