package Ejercicio.Ejercicio9;

public class Carrito {
    private double[] precios = new double[5];
    private int cantidad = 0;

    public void agregarPrecio(double precio) {
        if (cantidad < precios.length) {
            precios[cantidad] = precio;
            cantidad++;
        } // Se puede agregar un mensaje de error si se intenta agregar más de 5 precios
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < cantidad; i++) {
            total += precios[i];
        }
        return total;
    } // Método para obtener la cantidad de precios agregados
}