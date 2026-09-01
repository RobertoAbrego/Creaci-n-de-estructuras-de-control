package sistemaventas;
public class Producto {
 private int codigo;
 private String nombre;
 private double precio;
 private int stock;
 public Producto(int codigo, String nombre, double precio, int stock) {
 this.codigo = codigo;
 this.nombre = nombre;
 setPrecio(precio);
 this.stock = Math.max(stock, 0);
 }
 public int getCodigo() {
 return codigo;
 }
 public String getNombre() {
 return nombre;
 }
 public double getPrecio() {
 return precio;
 }
 public int getStock() {
 return stock;
 }
    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: el precio debe ser mayor que cero.");
        }
    }
 // Acceso por defecto: visible dentro del paquete sistemaventas.
 boolean hayStock(int cantidad) {
 return cantidad > 0 && cantidad <= stock;
 }
 public boolean descontarStock(int cantidad) {
 if (hayStock(cantidad)) {
 stock = stock - cantidad;
 return true;
 }
 return false;
 }
 public void reponerStock(int cantidad) {
 if (cantidad > 0) {
 stock = stock + cantidad;
 }
 }
 public double valorInventario() {
 return precio * stock;
 }
 public String obtenerResumen() {
 return codigo + " | " + nombre + " | $" +
 String.format("%.2f", precio) + " | Stock: " + stock;
 }
}