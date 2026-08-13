public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;
    // Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true; // Por defecto está disponible al crearse
    }
    // Método para prestar el libro
    public void prestar() {
        if (this.disponible) {
            this.disponible = false;
            System.out.println("Has prestado el libro: \"" + this.titulo + "\"");
        } else {
            System.out.println("El libro \"" + this.titulo + "\" ya se encuentra prestado.");
        }
    }
    // Método para devolver el libro
    public void devolver() {
        if (!this.disponible) {
            this.disponible = true;
            System.out.println("Has devuelto el libro: \"" + this.titulo + "\"");
        } else {
            System.out.println("El libro \"" + this.titulo + "\" ya estaba disponible.");
        }
    }
    @Override
    public String toString() {
        String estado = disponible ? "Disponible" : "Prestado";
        return "Libro [Título: " + titulo + ", Autor: " + autor + ", Estado: " + estado + "]";
    }
    public static void main(String[] args) {
        // Crear un arreglo de 3 libros
        Libro[] biblioteca = new Libro[3];
        biblioteca[0] = new Libro("Cien años de soledad", "Gabriel García Márquez");
        biblioteca[1] = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");
        biblioteca[2] = new Libro("El principito", "Antoine de Saint-Exupéry");

        // Prestar uno de los libros
        System.out.println("--- PRESTANDO UN LIBRO ---");
        biblioteca[1].prestar();
        System.out.println();

        // Mostrar el estado de todos los libros utilizando un bucle for-each
        System.out.println("--- ESTADO DE LA BIBLIOTECA ---");
        for (Libro libro : biblioteca) {
            System.out.println(libro.toString());
        }
    }
}