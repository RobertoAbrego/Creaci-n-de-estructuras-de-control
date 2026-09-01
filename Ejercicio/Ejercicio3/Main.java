package Ejercicio.Ejercicio3;

public class Main {

    public static void main(String[] args) {

        // Creamos el artículo
        Articulo articulo = new Articulo();

        // Probamos con un valor válido
        articulo.setStock(10);

        // Probamos con un valor negativo
        articulo.setStock(-3);

        // Mostramos el stock actual
        System.out.println("Stock actual: " + articulo.getStock());
    }
}
