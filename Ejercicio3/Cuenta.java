public class Cuenta { // Clase Cuenta

    private double saldo; // Saldo de la cuenta

    public double getSaldo() { // Obtiene el saldo
        return saldo;
    }

    public void depositar(double m) { // Recibe un monto para depositar
        if (m > 0) { // Verifica que sea mayor que 0
            saldo = saldo + m; // Suma el monto al saldo
        }
    }
}