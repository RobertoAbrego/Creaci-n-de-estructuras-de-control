package Ejercicios.Ejercicio8;

public class Cliente {
    private String nombre;
    private int edad;
    protected double porcentajeDescuento; // Atributo accesible para subclases

    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.porcentajeDescuento = 0.0;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }
}
