package sistemaventas;
public class ClienteFrecuente extends Cliente {
 public ClienteFrecuente(String nombre, int edad) {
 super(nombre, edad);
 porcentajeDescuento = 0.10;
 }
}