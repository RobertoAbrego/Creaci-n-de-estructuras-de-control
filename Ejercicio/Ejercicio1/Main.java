public class Main {

    public static void main(String[] args) {

        // Creamos una mascota
        Mascota mascota = new Mascota("Firulais", "Perro");

        // Accedemos directamente a los atributos
        System.out.println("Nombre: " + mascota.nombre);
        System.out.println("Tipo: " + mascota.tipo);
    }
}