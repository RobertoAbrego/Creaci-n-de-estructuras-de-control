public class Persona {
    private int edad; //Se declara la variable edad

    public void setEdad(int edad) {
       if (edad >= 0) {
           this.edad = edad; //Se asigna el valor a la variable edad
           System.out.println("Edad válida " + edad); //Se imprime un mensaje de éxito
       } else {
           System.out.println("Edad inválida " + edad); //Se imprime un mensaje de error si la edad es negativa
       }
    }   

    public int getEdad() {
        return edad; //Se retorna el valor de la variable edad
    } 
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(25); //Se asigna un valor válido
        persona.setEdad(-3); //Se intenta asignar un valor inválido
    } 
}
