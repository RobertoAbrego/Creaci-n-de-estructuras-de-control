package Ejemplo1;
// Archivo: Principal.java
public class Principal {
 public static void main(String[] args) {
 Libro l = new Libro("Java Basico", "Ana Reyes");
 l.mostrar();
 System.out.println("Titulo directo: " + l.titulo);
 }
}
// Explicación
// La clase, el constructor y los atributos son public: no hay restricciones de acceso,
// new Libro(...) funciona desde Principal sin ninguna limitación,
// l.titulo se lee directamente con el operador punto, porque el atributo es public,
// este es el nivel de acceso más simple, pero el menos protegido: cualquier clase podría también
// modificar l.titulo sin control.