package Ejemplo3;
// Archivo: Producto.java
public class Producto {
 private double precio;
 public Producto(double precio) {
 setPrecio(precio);
 }
 public double getPrecio() {
 return precio;
 }
 public void setPrecio(double precio) {
 if (precio > 0) {
 this.precio = precio;
 } else {
 System.out.println("Precio invalido, se ignora");
 }
 }
}
