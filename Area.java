public class Area {

    // Método para calcular el área de un cuadrado
    public double calcular(double lado) {
        return lado * lado;
    }

    // Sobrecarga del método para calcular el área de un rectángulo
    public double calcular(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {
        Area area = new Area();

        // Cálculo para un cuadrado de lado 5
        double areaCuadrado = area.calcular(5.0);
        System.out.println("Área del cuadrado: " + areaCuadrado); // Resultado: 25.0

        // Cálculo para un rectángulo de base 4 y altura 8
        double areaRectangulo = area.calcular(4.0, 8.0);
        System.out.println("Área del rectángulo: " + areaRectangulo); // Resultado: 32.0
    }
}