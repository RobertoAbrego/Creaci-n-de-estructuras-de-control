package Ejemplo1;
public class Principal {
    public static void main(String[] args) {
        Persona p = new Persona("Ana");

        p.edad = 25;
        p.saludar();

        System.out.println("Edad: " + p.edad);
    }
}