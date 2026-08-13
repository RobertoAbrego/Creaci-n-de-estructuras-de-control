public class Principal { // Clase principal

    public static void main(String[] args) { // Inicio del programa

        Cuenta cuenta1 = new Cuenta(); // Creamos un objeto de la clase Cuenta

        cuenta1.depositar(100); // Depositamos 100
        cuenta1.depositar(-20); // Intentamos depositar -20

        System.out.println("Saldo: " + cuenta1.getSaldo()); // Mostramos el saldo
    }
}