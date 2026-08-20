package Ejercicios.Ejercicio5;
public class Principal {

    public static void main(String[] args) {
        // Declaramos la variable, pero todavía no tiene un objeto
        Persona p = null;
        // Comprobamos que p no sea null antes de utilizarla
        if (p != null) {
            // Solo se ejecuta si p contiene un objeto
            p.saludar();
        } else {
            // Se ejecuta porque p actualmente es null
            System.out.println("La persona todavía no existe.");
        }
        // Creamos un objeto Persona
        p = new Persona();
        // Comprobamos nuevamente que p no sea null
        if (p != null) {
            // Ahora sí podemos llamar al método
            p.saludar();
        }
    }
}