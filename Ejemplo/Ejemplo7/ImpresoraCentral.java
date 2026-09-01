package Ejemplo7;

// Archivo: ImpresoraCentral.java 
public class ImpresoraCentral { 
    private static ImpresoraCentral instancia; 
    private int trabajosImpresos = 0; 
  
    private ImpresoraCentral() {   // constructor PRIVADO 
        System.out.println("Impresora inicializada"); 
    } 
    public static ImpresoraCentral obtener() { 
        if (instancia == null) { 
            instancia = new ImpresoraCentral(); 
        } 
        return instancia; 
    } 
    public void imprimir(String documento) { 
        trabajosImpresos++; 
        System.out.println("Imprimiendo: " + documento); 
    } 
}