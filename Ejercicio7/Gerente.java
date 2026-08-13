package Ejercicio7;

public class Gerente extends Empleado {

    // Indicamos que estamos sobrescribiendo un método de Empleado
    @Override
    public int calcularBono() {
        return 500;
    }
}