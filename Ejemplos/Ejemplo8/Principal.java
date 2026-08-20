package Ejemplos.Ejemplo8;

// Archivo: Principal.java  (usa la clase Persona) 
public class Principal { 
    public static void cumpleanios(Persona persona) { 
        persona.edad = persona.edad + 1; 
    } 
    public static void main(String[] args) { 
        Persona ana = new Persona("Ana", 20); 
        System.out.println("Antes: " + ana.edad); 
        cumpleanios(ana); 
        System.out.println("Despues: " + ana.edad); 
    } 
} 
