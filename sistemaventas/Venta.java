package sistemaventas;
public class Venta {
 public static final double IVA = 0.13;
 private static int contadorVentas = 0;
 private Producto producto;
 private Cliente cliente;
 private int cantidad;
 public Venta(Producto producto, Cliente cliente, int cantidad) {
 this.producto = producto;
 this.cliente = cliente;
 this.cantidad = cantidad;
 contadorVentas++;
 }

public static int getContadorVentas() {
    return contadorVentas;
}

 public double calcularSubtotal() {
 return producto.getPrecio() * cantidad;
 }
    public double calcularDescuento() {
        double porcentaje = cliente.getPorcentajeDescuento();

        if (cantidad >= 5) {
            porcentaje = porcentaje + 0.05;
        }

        return calcularSubtotal() * porcentaje;
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