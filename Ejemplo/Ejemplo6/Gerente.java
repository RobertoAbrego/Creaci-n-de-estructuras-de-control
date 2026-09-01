package Ejemplo6;
// Archivo: Gerente.java 
public class Gerente extends Empleado { 
    public Gerente(double salarioBase) { 
        super(salarioBase); 
    } 
    public double calcularSalarioTotal() { 
        return salarioBase + 300.0;   // acceso directo: protected 
    } 
} 