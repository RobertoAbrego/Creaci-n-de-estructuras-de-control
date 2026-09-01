package sistemaventas;
import java.util.Scanner;
public class SistemaVentas {
 private static final Scanner teclado = new Scanner(System.in);
 public static void main(String[] args) {
 Producto[] productos = {
    new Producto(101, "Teclado", 25.00, 10),
 new Producto(102, "Mouse", 15.50, 8),
 new Producto(103, "Memoria USB", 12.00, 12),
 new Producto(104, "Audifonos", 30.00, 5)
 };
 int opcion;
 do {
 mostrarMenu();
 opcion = leerEntero("Seleccione una opcion: ");
 switch (opcion) {
 case 1:
 listarProductos(productos);
 break;
 case 2:
 registrarVenta(productos);
 break;
 case 3:
 reponerInventario(productos);
 break;
 case 4:
 mostrarReporte(productos);
 break;
 case 5:
 System.out.println("Gracias por utilizar el sistema.");
 break;
 default:
 System.out.println("Opcion invalida. Intente nuevamente.");
 }
 } while (opcion != 5);
 teclado.close();
 }
 private static void mostrarMenu() {
 System.out.println("\n====================================");
 System.out.println(" SISTEMA DE VENTAS EN JAVA");
 System.out.println("====================================");
 System.out.println("1. Listar productos");
 System.out.println("2. Registrar venta");
 System.out.println("3. Reponer inventario");
 System.out.println("4. Reporte de inventario");
 System.out.println("5. Salir");
 }
 private static void listarProductos(Producto[] productos) {
 System.out.println("\n--- PRODUCTOS DISPONIBLES ---");
 for (Producto producto : productos) {
 System.out.println(producto.obtenerResumen());
 }
 }
 private static void registrarVenta(Producto[] productos) {
 listarProductos(productos);
 int codigo = leerEntero("Codigo del producto: ");
 Producto producto = buscarProducto(productos, codigo);
 if (producto == null) {
 System.out.println("No existe un producto con ese codigo.");
 return;
 }
 int cantidad = leerEntero("Cantidad a comprar: ");
 if (!producto.hayStock(cantidad)) {
 System.out.println("Cantidad invalida o stock insuficiente.");
 return;
 }
 System.out.print("Nombre del cliente: ");
 String nombre = teclado.nextLine().trim();
 int edad = leerEntero("Edad del cliente: ");
 System.out.print("¿Es cliente frecuente? (S/N): ");
 String respuesta = teclado.nextLine().trim();
 boolean esFrecuente = respuesta.equalsIgnoreCase("S");
 Cliente cliente;
 if (esFrecuente) {
 cliente = new ClienteFrecuente(nombre, edad);
 } else {
 cliente = new Cliente(nombre, edad);
 }
 if (!cliente.esMayorEdad()) {
 System.out.println("Aviso: cliente menor de edad registrado.");
 }
 Venta venta = new Venta(producto, cliente, cantidad);
 if (producto.descontarStock(cantidad)) {
 System.out.println(venta.generarDetalle());
 } else {
 System.out.println("No fue posible completar la venta.");
 }
 }
 private static void reponerInventario(Producto[] productos) {
 int codigo = leerEntero("Codigo del producto: ");
 Producto producto = buscarProducto(productos, codigo);
 if (producto == null) {
 System.out.println("Producto no encontrado.");
 return;
 }
 int cantidad = leerEntero("Cantidad a agregar: ");
 if (cantidad <= 0) {
 System.out.println("La cantidad debe ser mayor que cero.");
 return;
 }
 producto.reponerStock(cantidad);
 System.out.println("Stock actualizado: " + producto.getStock());
 }
 private static void mostrarReporte(Producto[] productos) {
 double valorTotal = 0;
 int unidadesTotales = 0;
 int productosStockBajo = 0;
 System.out.println("\n--- REPORTE DE INVENTARIO ---");
 for (Producto producto : productos) {
 valorTotal = valorTotal + producto.valorInventario();
 unidadesTotales = unidadesTotales + producto.getStock();
 if (producto.getStock() < 5) {
 productosStockBajo++;
 }
 }
 boolean requiereAtencion = productosStockBajo > 0 || unidadesTotales < 20;
 System.out.println("Unidades totales: " + unidadesTotales);
 System.out.println("Valor del inventario: $" +
 String.format("%.2f", valorTotal));
 System.out.println("Productos con stock bajo: " + productosStockBajo);
 System.out.println("Requiere atencion: " + requiereAtencion);
 }
 private static Producto buscarProducto(Producto[] productos, int codigo) {
 for (Producto producto : productos) {
 if (producto.getCodigo() == codigo) {
 return producto;
 }
 }
 return null;
 }
 private static int leerEntero(String mensaje) {
 int numero;
 while (true) {
 System.out.print(mensaje);
 if (teclado.hasNextInt()) {
 numero = teclado.nextInt();
 teclado.nextLine();
 return numero;
 }
 System.out.println("Entrada invalida. Debe escribir un numero entero.");
 teclado.nextLine();
 }
 }
}