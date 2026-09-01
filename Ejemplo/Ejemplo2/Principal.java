package Ejemplo2;
// Archivo: Principal.java
public class Principal {
 public static void main(String[] args) {
 Empleado e = new Empleado("Carlos", 800.0);
 System.out.println(e.nombre + " gana $" + e.getSalario());
 // e.salario = 5000; <-- ERROR: salario es private
 }
}
// Explicación
// Nombre es public: se lee y escribe libremente,
// salario es private: solo existe getSalario() para leerlo; no hay setter,
// la línea comentada no compilaría si se descomentara: ninguna clase externa puede asignar salario
// directamente,
// Este patrón (sin setter) protege un dato para que nunca cambie después de creado el objeto.
