public class NumeroPositivo {
    // public class crea una clase llamada NumeroPositivo 
    public static void main(String[] args) {
    // Este es el método main, es el punto donde comienza 
    // la ejecución del programa

        int numero = 5;
    // Se declara una variable de tipo int (entero).

        if (numero > 0) {
    //  // Comprobamos si la condición numero > 0 es verdadera

            System.out.println("El numero es positivo");
        }
    // sirve para mostrar un mensaje en la consola, en 
    // la cual solo se ejecuta si es verdadero

        numero = -3;
    // Ahora la variable cambia su valor de 5 a -3

        if (numero > 0) {
    // Se vuelve a preguntar si el número es mayor que cero

            System.out.println("El numero es positivo");
        }
    }
}