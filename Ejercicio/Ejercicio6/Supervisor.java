package Ejercicio.Ejercicio6;

class Supervisor extends Trabajador {

    // Constructor que invoca al constructor de la clase padre mediante super()
    public Supervisor(double sueldoBase) {
        super(sueldoBase);
    } // Cierre del constructor

    // Método que accede a sueldoBase (protected) y suma el bono
    public double sueldoTotal() {
        return this.sueldoBase + 200;
    } // Cierre del método sueldoTotal
}