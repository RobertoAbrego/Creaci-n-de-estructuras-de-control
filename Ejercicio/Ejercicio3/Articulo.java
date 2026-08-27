package Ejercicio.Ejercicio3;

// Clase que representa un artículo
public class Articulo {

    // Stock privado
    private int stock;

    // Setter para modificar el stock
    public void setStock(int stock) {

        // Validamos que el stock no sea negativo
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Stock invalido");
        }
    }

    // Getter para consultar el stock
    public int getStock() {
        return stock;
    }
}