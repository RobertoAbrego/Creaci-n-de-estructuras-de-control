package Ejercicios.Ejercicio6;

public class Venta {
    private Producto producto;
    private Cliente cliente;
    private Vendedor vendedor;
    private int cantidad;

    public Venta(Producto producto, Cliente cliente, Vendedor vendedor, int cantidad) {
        this.producto = producto;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.cantidad = cantidad;
    }
    
    public Vendedor getVendedor() { return vendedor; }
}