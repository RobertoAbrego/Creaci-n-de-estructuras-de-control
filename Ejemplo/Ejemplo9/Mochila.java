package Ejemplo.Ejemplo9;

// Archivo: Mochila.java 
public class Mochila { 
    private String[] objetos = new String[5]; 
    private int cantidad = 0; 
  
    public void agregar(String objeto) { 
        if (cantidad < objetos.length) { 
            objetos[cantidad] = objeto; 
            cantidad++; 
        } else { 
            System.out.println("Mochila llena"); 
        } 
    } 
    public void mostrarContenido() { 
        for (int i = 0; i < cantidad; i++) { 
            System.out.println("- " + objetos[i]); 
        } 
    } 
}