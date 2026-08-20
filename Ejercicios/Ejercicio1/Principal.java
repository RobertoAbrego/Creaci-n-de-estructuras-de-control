public class Principal {
    // Punto de inicio del programa
    public static void main(String[] args) {

        // Creamos un objeto de la clase Libro
        Libro libro = new Libro();

        // Asignamos un título al objeto
        libro.titulo = "Cien años de soledad";

        // Asignamos un autor al objeto
        libro.autor = "Gabriel García Márquez";

        // Mostramos el título del libro
        System.out.println("Título: " + libro.titulo);

        // Mostramos el autor del libro
        System.out.println("Autor: " + libro.autor);
    }
}