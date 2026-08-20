package Ejercicios.Ejercicio3;

public class Principal {

    // Punto de inicio del programa
    public static void main(String[] args) {

        // Creamos el primer objeto Contador
        Contador contador1 = new Contador();

        // Incrementamos el contador 2 veces
        contador1.incrementar();
        contador1.incrementar();


        // Creamos el segundo objeto Contador
        Contador contador2 = new Contador();

        // Incrementamos el contador 5 veces
        contador2.incrementar();
        contador2.incrementar();
        contador2.incrementar();
        contador2.incrementar();
        contador2.incrementar();


        // Creamos el tercer objeto Contador
        Contador contador3 = new Contador();

        // Incrementamos el contador 3 veces
        contador3.incrementar();
        contador3.incrementar();
        contador3.incrementar();


        // Mostramos el valor de cada contador
        System.out.println("Contador 1: " + contador1.valor);
        System.out.println("Contador 2: " + contador2.valor);
        System.out.println("Contador 3: " + contador3.valor);
    }
}