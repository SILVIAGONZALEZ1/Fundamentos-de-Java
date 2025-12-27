package c01_principiante;

public class VariablesAndConstants {
    public static void main(String[] args) {
        //Variables
        String name = "Silvia";
        System.out.println(name);
//String va entre comillas dobles
        name = "Juan";
        System.out.println(name);
//los numeros no van entre comillas
        name ="37";
        name = String.valueOf(45);
        System.out.println(name);

        int age = 50;
        System.out.println(age);



        var email = "otroemail@gmail.com";
        System.out.println(email);

        var year = 2024;
        System.out.println(year);


        // Constantes
        // Una constante se declara con la palabra clave 'final'
        // y su valor no puede cambiar una vez asignado.
        // Las constantes se nombran generalmente en mayúsculas.
        final String EMAIL = "devsoftwaregonzalez@gmail.com";
        System.out.println(EMAIL);

        //EMAIL = "silvia@gmail.com"; es una constante no se puede modificar
        System.out.println(EMAIL);


        // Declaración de una variable entera
        int edad = 25;
        // Declaración de una variable de tipo cadena
        String nombre = "Juan";
        // Declaración de una constante
        final double PI = 3.14159;

        // Imprimir las variables y la constante
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Valor de PI: " + PI);
    }
}
