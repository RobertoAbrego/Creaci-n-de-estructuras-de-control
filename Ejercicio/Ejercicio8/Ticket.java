package Ejercicio.Ejercicio8;

public class Ticket {
    private static int contador = 0;
    private final int numero;

    public Ticket() {
        contador++;
        this.numero = contador;
    } // Constructor que incrementa el contador y asigna el número de ticket

    public int getNumero() {
        return numero;
    } // Método para obtener el número de ticket
}