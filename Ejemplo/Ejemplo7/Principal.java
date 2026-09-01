package Ejemplo7;

// Archivo: Principal.java 
public class Principal { 
    public static void main(String[] args) { 
        ImpresoraCentral i1 = ImpresoraCentral.obtener(); 
        ImpresoraCentral i2 = ImpresoraCentral.obtener(); 
        i1.imprimir("Reporte.pdf"); 
        i2.imprimir("Factura.pdf"); 
        System.out.println("Misma impresora: " + (i1 == i2)); 
    } 
} 