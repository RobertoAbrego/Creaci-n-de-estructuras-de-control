package Ejemplo9;

  
// Archivo: Principal.java 
public class Principal { 
    public static void main(String[] args) { 
        Mochila m = new Mochila(); 
        m.agregar("Cuaderno"); 
        m.agregar("Lapiz"); 
        // m.objetos[0] = "Hackeado";  <-- ERROR: objetos es private 
        m.mostrarContenido(); 
    } 
}