package Ejercicios.Ejercicio7;

public class Estudiante {
    private String nombre;
    private double nota;

    // Constructor de la clase
    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // Métodos getter para acceder a los atributos
    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public static void main(String[] args) {
        // 1. Declarar y reservar espacio para el arreglo de 3 posiciones
        // NOTA: Esto solo crea el arreglo de referencias (actualmente con valor null)
        Estudiante[] estudiantes = new Estudiante[3];

        // 2. Instanciar cada objeto individualmente
        estudiantes[0] = new Estudiante("María López", 9.2);
        estudiantes[1] = new Estudiante("Carlos Ruiz", 6.8);
        estudiantes[2] = new Estudiante("Lucía Gómez", 8.5);

        // 3. Recorrer el arreglo con un bucle for-each
        for (Estudiante e : estudiantes) {
            System.out.println("Estudiante: " + e.getNombre() + " | Nota: " + e.getNota());
        }
    }
}