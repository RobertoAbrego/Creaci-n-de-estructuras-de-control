package Ejercicio7;

public class Principal {

    // Aquí comienza el programa
    public static void main(String[] args) {

        // Creamos un objeto Empleado
        Empleado empleado = new Empleado();

        // Creamos un objeto Gerente
        Gerente gerente = new Gerente();

        // Mostramos el bono del empleado
        System.out.println("Bono empleado: " + empleado.calcularBono());

        // Mostramos el bono del gerente
        System.out.println("Bono gerente: " + gerente.calcularBono());
    }
}