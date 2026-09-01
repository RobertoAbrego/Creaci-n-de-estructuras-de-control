package Ejemplo4;
// Archivo: Principal.java
public class Principal {
 public static void main(String[] args) {
 Calculadora calc = new Calculadora();
 int[] datos = {5, -3, 8, -1, 2};
 System.out.println("Suma: " + calc.sumarPositivos(datos));
 // calc.esPositivo(4); <-- ERROR: metodo private
 }
}
// Explicación
// esPositivo(int) es private: es un detalle interno de Calculadora,
// sumarPositivos (público) sí puede llamar a esPositivo porque están en la misma clase,
// desde Principal, calc.esPositivo(4) no compilaría,
// solo se suman los positivos (5+8+2=15); los negativos se ignoran gracias al método auxiliar.