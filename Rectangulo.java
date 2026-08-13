public class Rectangulo {
    int base;
    int altura; //Se declara la variable

     public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura; 
    } //Se crea el constructor de la clase Rectangulo

    public void Area() {
        System.out.println("El área del rectángulo es: " + (base * altura));
    } //Se crea el método Area que calcula el área del rectángulo y la imprime en pantalla

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5, 4);
        rectangulo.Area();
    } //Se crea el método main que instancia un objeto
    
}
