package Ejemplo5;
public class Principal {
    public static void main(String[] args) {

        Persona p = null;

        if (p == null) {
            System.out.println("La referencia no apunta a nada");
        } else {
            p.saludar();
        }
        p = new Persona("Ana");

        p.saludar();
    }
}