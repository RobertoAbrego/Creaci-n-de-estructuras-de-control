public class PuedeVolar {
    // Se crea la clase llamada PuedeVolar
    public static void main(String[] args) {
    // Inicio del programa

        int edad = 20;
    // Creamos la variable edad y le asignamos el valor de 20

        if (edad >= 18) {
    // ¿La edad es mayor o igual a 18?

            System.out.println("Puede volar");
    // Si la condición es verdadera, muestra ese mensaje

        } else {
            System.out.println("Aun no puede volar");
        }
    // Muestra que todavía no puede volar.

        edad = 16;
    // Ahora la edad cambia a 16

        if (edad >= 18) {
            System.out.println("Puede volar");
        } else {
            System.out.println("Aun no puede volar");
        }
    }
}