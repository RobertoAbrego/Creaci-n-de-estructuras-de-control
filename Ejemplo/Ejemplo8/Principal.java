package Ejemplo.Ejemplo8;

  
// Archivo: Principal.java 
public class Principal { 
    public static void main(String[] args) { 
        Usuario u1 = new Usuario("Ana"); 
        Usuario u2 = new Usuario("Luis"); 
        Usuario u3 = new Usuario("Marta"); 
        System.out.println(u1.nombre + " - ID: " + u1.getId()); 
        System.out.println(u3.nombre + " - ID: " + u3.getId()); 
        System.out.println("Total usuarios: " + Usuario.getTotalUsuarios()); 
    } 
} 
