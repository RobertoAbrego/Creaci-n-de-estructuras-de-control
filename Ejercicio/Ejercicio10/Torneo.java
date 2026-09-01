package Ejercicio.Ejercicio10;

public class Torneo {
    private Equipo[] equipos = new Equipo[4]; // Array para almacenar los equipos inscritos
    private int cantidad = 0;

    public boolean inscribir(Equipo equipo) {
        if (cantidad < equipos.length) {
            equipos[cantidad] = equipo;
            cantidad++;
            return true;
        } // Si hay espacio, se inscribe el equipo y se incrementa la cantidad
        return false;
    } // Método para inscribir un equipo en el torneo

    public void mostrarEquipos() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println((i + 1) + ". " + equipos[i].nombre);
        }
    } // Método para mostrar los equipos inscritos
}