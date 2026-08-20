package Ejemplo4;
public class Principal {
    public static void main(String[] args) {
        Persona a = new Persona("Ana");

        Persona b = a; // misma referencia

        b.nombre = "Luis";

        System.out.println("a: " + a.nombre);
        System.out.println("b: " + b.nombre);
    }
}