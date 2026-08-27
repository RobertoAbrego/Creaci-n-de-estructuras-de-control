package Ejemplo5;
// Archivo: Principal.java (mismo paquete)
public class Principal {
    public static void main(String[] args) {
 Sensor s = new Sensor(); // funciona: mismo paquete
 System.out.println("Temperatura: " + s.leerTemperatura());
 }
}
// Explicación
// Sensor no lleva public, así que tiene acceso de paquete (package-private),
// como Principal está en el mismo paquete, puede crear el objeto con new Sensor() sin problema,
// si Principal estuviera en otro paquete, esta línea no compilaría: Sensor sería invisible desde fuera de
// su paquete.