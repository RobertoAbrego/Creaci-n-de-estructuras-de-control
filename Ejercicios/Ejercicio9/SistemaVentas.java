package Ejercicios.Ejercicio9;

import java.util.Scanner;

public class SistemaVentas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continuarComprando = true;
        double acumuladoGeneral = 0;

        System.out.println("--- INICIO DE SESIÓN DE VENTAS MÚLTIPLES ---");
        while (continuarComprando) {
            System.out.print("Ingrese el monto de la venta actual: $");
            double subtotalVenta = teclado.nextDouble();
            acumuladoGeneral += subtotalVenta;

            System.out.print("¿Desea registrar otra venta? (S/N): ");
            String respuesta = teclado.next();
            if (respuesta.equalsIgnoreCase("N")) {
                continuarComprando = false;
            }
        }
        System.out.println("El total acumulado de todas las ventas es: $" + acumuladoGeneral);
        teclado.close();
    }
}