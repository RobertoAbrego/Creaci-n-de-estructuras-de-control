public class ClasificarTemperatura {
    // Se crea la clase.
    public static void main(String[] args) {
    // Comienza el programa

        int temp = 10;
    // Se crea una variable llamada temp, y se guarda el valor 10

        if (temp < 15) {
            System.out.println(temp + " -> Frio");
        } else if (temp <= 25) {
            System.out.println(temp + " -> Templado");
        } else {
            System.out.println(temp + " -> Caluroso");
        }

        temp = 20;

        if (temp < 15) {
            System.out.println(temp + " -> Frio");
        } else if (temp <= 25) {
            System.out.println(temp + " -> Templado");
        } else {
            System.out.println(temp + " -> Caluroso");
        }

        temp = 30;

        if (temp < 15) {
            System.out.println(temp + " -> Frio");
        } else if (temp <= 25) {
            System.out.println(temp + " -> Templado");
        } else {
            System.out.println(temp + " -> Caluroso");
        }
    }
}
// Aquí se usa una escalera de decisiones,
// la cual sirve cuando existen más de dos posibilidades,
// el programa revisa las condiciones de arriba hacia abajo,
// y cuando encuentra una verdadera, ejecuta ese bloque y ya 
// no revisa las siguientes.