// Clase base Animal
class Animal {
    protected String nombre;

    // Constructor que inicializa el atributo nombre
    public Animal(String nombre) {
        this.nombre = nombre;
    }
}

// Clase derivada Gato
class Gato extends Animal {

    // Constructor de Gato
    public Gato(String nombre) {
        super(nombre); // Llama al constructor de Animal en la primera línea
    }

    public void maullar() {
        System.out.println(this.nombre + " dice: ¡Miau!");
    }

    public static void main(String[] args) {
        Gato miGato = new Gato("Michi");
        miGato.maullar(); // Salida: Michi dice: ¡Miau!
    }
}