package Ejemplo8;

// Archivo: Usuario.java 
public class Usuario { 
    private static int totalUsuarios = 0; 
    private final int id; 
    public String nombre; 
  
    public Usuario(String nombre) { 
        this.nombre = nombre; 
        totalUsuarios++; 
        this.id = totalUsuarios; 
    } 
    public int getId() { 
        return id; 
    } 
    public static int getTotalUsuarios() { 
        return totalUsuarios; 
    } 
} 
