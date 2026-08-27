package Ejercicio.Ejercicio10;

public class Principal {
    public static void main(String[] args) {
        Torneo torneo = new Torneo();

        System.out.println("Equipo 1: " + torneo.inscribir(new Equipo("Real Madrid")));
        System.out.println("Equipo 2: " + torneo.inscribir(new Equipo("Barcelona")));
        System.out.println("Equipo 3: " + torneo.inscribir(new Equipo("Bayern")));
        System.out.println("Equipo 4: " + torneo.inscribir(new Equipo("Juventus")));
        System.out.println("Equipo 5: " + torneo.inscribir(new Equipo("PSG")));

        System.out.println("\nEquipos inscritos:");
        torneo.mostrarEquipos();
    } // Método principal para ejecutar el programa
}