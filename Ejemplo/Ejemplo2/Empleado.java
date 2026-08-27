package Ejemplo2;
// Archivo: Empleado.java
public class Empleado {
 public String nombre;
 private double salario;
 public Empleado(String nombre, double salario) {
 this.nombre = nombre;
 this.salario = salario;
 }
 public double getSalario() {
 return salario;
 }
}
