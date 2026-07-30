public class Ejercicio09 {
    public static void main(String[] args) {
        int[] numeros = {12, 45, 7, 88, 23};
        //Se declara un arreglo de enteros llamado "numeros" y se inicializa con algunos valores.
        int mayor = numeros[0];
        //Se declara una variable entera llamada "mayor" y se inicializa con el primer elemento del arreglo.

        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
                //Se compara cada número en el arreglo con el valor actual de "mayor" 
                //Si se encuentra un número mayor, se actualiza la variable "mayor" con ese valor.
            }
        }

        System.out.println("El mayor es: " + mayor);
        //Se imprime el mayor de los números en el arreglo
    }
}
