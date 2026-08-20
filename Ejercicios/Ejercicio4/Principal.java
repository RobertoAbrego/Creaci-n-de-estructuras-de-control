package Ejercicios.Ejercicio4;

public class Principal {

    // Punto de inicio del programa
    public static void main(String[] args) {
        // Creamos un objeto Persona y lo guardamos en a
        Persona a = new Persona();
        // Asignamos un nombre al objeto
        a.nombre = "Carlos";
        // b recibe la misma referencia que a
        Persona b = a;
        // Cambiamos el nombre utilizando b
        b.nombre = "Pedro";
        // Mostramos el nombre utilizando a
        System.out.println("Nombre desde a: " + a.nombre);
        // Mostramos el nombre utilizando b
        System.out.println("Nombre desde b: " + b.nombre);

    }
}