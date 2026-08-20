package Ejemplos.Ejemplo6;

// Archivo: Principal.java 
public class Principal { 
    public static void main(String[] args) { 
        Producto p1 = new Producto("Lapiz"); 
        Producto p2 = new Producto("Mochila", 15.0); 
        System.out.println(p1.nombre + ": $" + p1.precio); 
        System.out.println(p2.nombre + ": $" + p2.precio); 
    } 
} 
