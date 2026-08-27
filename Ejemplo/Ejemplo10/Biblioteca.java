package Ejemplo.Ejemplo10;

  
// Archivo: Biblioteca.java 
public class Biblioteca { 
    private Libro[] coleccion = new Libro[3]; 
    private int cantidad = 0; 
  
    public boolean agregarLibro(Libro libro) { 
        if (cantidad < coleccion.length) { 
            coleccion[cantidad] = libro; 
            cantidad++; 
            return true; 
        } 
        return false; 
    } 
    public void listarLibros() { 
        for (int i = 0; i < cantidad; i++) { 
            System.out.println((i + 1) + ". " + coleccion[i].titulo); 
        } 
    } 
} 