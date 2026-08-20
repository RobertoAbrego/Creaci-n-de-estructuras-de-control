package Ejemplos.Ejemplo7;

// Archivo: Principal.java  (usa la clase Persona) 
public class Principal { 
    public static void main(String[] args) { 
        Persona[] grupo = new Persona[3];   // 3 referencias null 
        grupo[0] = new Persona("Ana"); 
        grupo[1] = new Persona("Luis"); 
        grupo[2] = new Persona("Marta"); 
        for (Persona persona : grupo) { 
            persona.saludar(); 
        } 
    } 
}
