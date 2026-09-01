package sistemaventas;
public class Venta {
 public static final double IVA = 0.13;
 private Producto producto;
 private Cliente cliente;
 private int cantidad;
 public Venta(Producto producto, Cliente cliente, int cantidad) {
 this.producto = producto;
 this.cliente = cliente;
 this.cantidad = cantidad;
 }
 public double calcularSubtotal() {
 return producto.getPrecio() * cantidad;
 }
 public double calcularDescuento() {
 return calcularSubtotal() * cliente.getPorcentajeDescuento();
 }
 public double calcularBaseImponible() {
 return calcularSubtotal() - calcularDescuento();
 }
 public double calcularIva() {
 return calcularBaseImponible() * IVA;
  }
 public double calcularTotal() {
 return calcularBaseImponible() + calcularIva();
 }
 public String generarDetalle() {
 String tipoCliente = cliente.getPorcentajeDescuento() > 0
 ? "Frecuente" : "Regular";
 return "\n===== COMPROBANTE DE VENTA =====" +
 "\nCliente: " + cliente.getNombre() +
 "\nTipo: " + tipoCliente +
 "\nProducto: " + producto.getNombre() +
 "\nCantidad: " + cantidad +
 "\nSubtotal: $" + String.format("%.2f", calcularSubtotal()) +
 "\nDescuento: $" + String.format("%.2f", calcularDescuento()) +
 "\nIVA (13%): $" + String.format("%.2f", calcularIva()) +
 "\nTOTAL: $" + String.format("%.2f", calcularTotal()) +
 "\n===============================";
 }
}