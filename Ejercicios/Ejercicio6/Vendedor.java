package Ejercicios.Ejercicio6;

public class Vendedor {
    private int codigo;
    private String nombre;

    public Vendedor(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
}