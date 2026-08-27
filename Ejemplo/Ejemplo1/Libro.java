package Ejemplo1;
// Archivo: Libro.java
public class Libro {
 public String titulo;
 public String autor;
 public Libro(String titulo, String autor) {
 this.titulo = titulo;
 this.autor = autor;
 }
 public void mostrar() {
 System.out.println(titulo + " - " + autor);
 }
}