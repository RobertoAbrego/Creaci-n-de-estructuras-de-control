package Ejercicio.Ejercicio9;

public class Principal {
    public static void main(String[] args) {
        Carrito c = new Carrito();
        c.agregarPrecio(10.0);
        c.agregarPrecio(5.5);
        c.agregarPrecio(2.25); // Agregar más precios según sea necesario

        System.out.println("Total: " + c.calcularTotal());
    } // Método principal para ejecutar el programa
}