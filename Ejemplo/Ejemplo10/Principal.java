package Ejemplo10;

  
// Archivo: Principal.java 
public class Principal { 
    public static void main(String[] args) { 
        Biblioteca b = new Biblioteca(); 
        b.agregarLibro(new Libro("Java Basico")); 
        b.agregarLibro(new Libro("POO en Java")); 
        boolean agregado = b.agregarLibro(new Libro("Estructuras de Datos")); 
        boolean rechazado = b.agregarLibro(new Libro("Extra")); 
        System.out.println("Tercero agregado: " + agregado); 
        System.out.println("Cuarto agregado: " + rechazado); 
        b.listarLibros(); 
    } 
} 