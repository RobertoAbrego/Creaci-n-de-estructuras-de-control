package Ejercicios.Ejercicio8;

public class ClienteCorporativo extends Cliente {
    
    public ClienteCorporativo(String nombre, int edad) {
        super(nombre, edad);
        this.porcentajeDescuento = 0.15; // Modifica directamente el atributo protegido de la clase padre
    }
}
