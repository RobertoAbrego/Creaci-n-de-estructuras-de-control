package Ejercicios.Ejercicio10;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public static void main(String[] args) {
        // 1. Crear e instanciar el arreglo de 3 productos
        Producto[] productos = new Producto[3];
        productos[0] = new Producto("Laptop", 1200.0);
        productos[1] = new Producto("Smartphone", 800.0);
        productos[2] = new Producto("Tablet", 500.0);

        // 2. Sumar los precios con un acumulador en un bucle
        double suma = 0;
        for (Producto p : productos) {
            suma += p.getPrecio();
        }

        // 3. Calcular el promedio dinámicamente con length
        double promedio = suma / productos.length;

        // Imprimir el resultado exacto
        System.out.println("Promedio: " + promedio);
    }
}
