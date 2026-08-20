package Ejemplo3;
public class Principal {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();

        c1.incrementar();
        c1.incrementar();

        c2.incrementar();

        System.out.println("c1: " + c1.valor);
        System.out.println("c2: " + c2.valor);
    }
}