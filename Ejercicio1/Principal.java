public class Principal { // Clase principal

    public static void main(String[] args) { // Inicio del programa

        Mascota mascota1 = new Mascota(); // Creamos un objeto de tipo Mascota

        mascota1.nombre = "Max"; // Asignamos el nombre usando el punto
        mascota1.especie = "Perro"; // Asignamos la especie usando el punto

        mascota1.describir(); // Llamamos al método describir()
    }
}