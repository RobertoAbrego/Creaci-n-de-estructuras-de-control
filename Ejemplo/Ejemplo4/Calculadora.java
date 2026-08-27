package Ejemplo4;
// Archivo: Calculadora.java
public class Calculadora {
 private boolean esPositivo(int n) { // metodo privado
 return n > 0;
 }
 public int sumarPositivos(int[] numeros) {
 int total = 0;
 for (int n : numeros) {
 if (esPositivo(n)) {
 total = total + n;
 }
 }
 return total;
 }
}