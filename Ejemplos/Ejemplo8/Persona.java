package Ejemplos.Ejemplo8;

public class Persona { 
String nombre; 
int edad; 
public Persona(String nombre) { 
this(nombre, 0);   // llama al otro constructor 
} 
public Persona(String nombre, int edad) { 
this.nombre = nombre; 
this.edad = edad; 
} 
} 