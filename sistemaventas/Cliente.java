package sistemaventas;
public class Cliente {
 private String nombre;
 private int edad;
 protected double porcentajeDescuento;
 public Cliente(String nombre, int edad) {
 this.nombre = nombre;
 this.edad = edad;
 this.porcentajeDescuento = 0.0;
 }
 public String getNombre() {
 return nombre;
 }
 public int getEdad() {
 return edad;
 }
 public boolean esMayorEdad() {
 return edad >= 18;
 }
 public double getPorcentajeDescuento() {
 return porcentajeDescuento;
 }
}
