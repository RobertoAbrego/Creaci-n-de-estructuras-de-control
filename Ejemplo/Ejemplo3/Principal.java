package Ejemplo3;
// Archivo: Principal.java
public class Principal {
 public static void main(String[] args) {
 Producto p = new Producto(10.0);
 p.setPrecio(-5.0); // intento invalido
 p.setPrecio(15.0); // valido
 System.out.println("Precio final: " + p.getPrecio());
 }
}
// Explicación
// El constructor reutiliza el setter para inicializar precio, así la validación se aplica también al crear
// el objeto,
// p.setPrecio(-5.0) es rechazado: el if evita asignar un valor no positivo,
// p.setPrecio(15.0) sí se aplica, porque cumple la validación,
// getPrecio() confirma que precio terminó en 15.0, no en -5.0.