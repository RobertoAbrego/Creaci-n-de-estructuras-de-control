package Ejercicio.Ejercicio8;

public class Principal {
    public static void main(String[] args) {
        Ticket t1 = new Ticket();
        Ticket t2 = new Ticket();
        Ticket t3 = new Ticket(); // Crea tres objetos de la clase Ticket

        System.out.println("Ticket numero: " + t1.getNumero());
        System.out.println("Ticket numero: " + t2.getNumero());
        System.out.println("Ticket numero: " + t3.getNumero()); // Muestra el numero de ticket de cada objeto
    }
}