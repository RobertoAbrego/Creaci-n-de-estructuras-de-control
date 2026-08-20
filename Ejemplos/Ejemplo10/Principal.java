package Ejemplos.Ejemplo10;

// Archivo: Principal.java 
public class Principal { 
    public static void main(String[] args) { 
        Articulo[] carrito = new Articulo[3]; 
        carrito[0] = new Articulo("Lapiz", 0.50); 
        carrito[1] = new Articulo("Cuaderno", 2.25); 
        carrito[2] = new Articulo("Mochila", 15.00); 
        double total = 0; 
        for (Articulo a : carrito) { 
            System.out.println(a.nombre + ": $" + a.precio); 
            total = total + a.precio; 
        } 
        System.out.println("Total: $" + total); 
    } 
} 