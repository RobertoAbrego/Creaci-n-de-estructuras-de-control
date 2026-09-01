package Ejercicios.Ejercicio5;

public class SistemaVentas {
    public static void main(String[] args) {
        Producto[] productos = {
            new Producto(101, "Teclado", 25.00, 10),
            new Producto(102, "Mouse", 15.50, 8)
        };

        Producto encontrado = buscarProductoPorNombre(productos, "mouse");
        if (encontrado != null) {
            System.out.println("Producto encontrado: " + encontrado.getNombre() + " | Precio: $" + encontrado.getPrecio());
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static Producto buscarProductoPorNombre(Producto[] productos, String nombreBuscado) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombreBuscado)) {
                return producto;
            }
        }
        return null;
    }
}