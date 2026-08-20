package Ejercicios.Ejercicio9;

public class Estudiante {
    private String nombre;
    private double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public static void main(String[] args) {
        // 1. Crear e instanciar el arreglo de 3 estudiantes
        Estudiante[] estudiantes = new Estudiante[3];
        estudiantes[0] = new Estudiante("Ana", 8.0);
        estudiantes[1] = new Estudiante("Carlos", 6.0);
        estudiantes[2] = new Estudiante("Sofía", 10.0);

        // 2. Sumar las notas con un acumulador en un bucle
        double suma = 0;
        for (Estudiante e : estudiantes) {
            suma += e.getNota();
        }

        // 3. Calcular el promedio dinámicamente con length
        double promedio = suma / estudiantes.length;

        // Imprimir el resultado exacto
        System.out.println("Promedio: " + promedio);
    }
}