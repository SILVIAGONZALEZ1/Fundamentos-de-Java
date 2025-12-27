package c01_principiante;

public class EjerciciosPrincipiantes {

    // 1. Declara una variable de tipo String y asígnale tu nombre.
    public static void main(String[] args) {
        String nombre = "Tu Nombre";
        System.out.println("Nombre: " + nombre);


        // 2. Crea una variable de tipo int y asígnale tu edad.
        int edad = 50;
        System.out.println("Edad: " + edad);

        // 3. Crea una variable double con tu altura en metros.
        double altura = 1.65;
        System.out.println("Altura: " + altura + " metros");

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean gustaProgramar = true;
        System.out.println("¿Te gusta programar? " + gustaProgramar);

        // 5. Declara una constante con tu email.
        final String EMAIL = "devsoftwaregonzalez@gmail.com"; // final se usa para declarar constantes y tambien palabras en mayusculas
        System.out.println("Email: " + EMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char inicial = 'S';
        System.out.println("Inicial: " + inicial);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String localidad = "San Francisco del Monte";
        System.out.println("Localidad: " + localidad);
        localidad = "Mendoza";
        System.out.println("Localidad actualizada: " + localidad);


        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 10;
        int b = 20;
        int suma = a + b;
        System.out.println("Suma de a y b: " + suma);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println("Tipo de la variable 'nombre': " + ((Object)nombre).getClass().getSimpleName());
        System.out.println("Tipo de la variable 'edad': " + ((Object)edad).getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        String ciudad;
        ciudad = "Buenos Aires";
        System.out.println("Ciudad: " + ciudad);

/*      Reformat / identar todo el archivo o la selección: Ctrl + Alt + L
                                    (para todo el archivo: Ctrl + A luego Ctrl + Alt + L)
        Indentar / desindentar la selección: Tab / Shift + Tab
        Menú: Code → Reformat Code (misma acción que Ctrl + Alt + L)
        */

    }
}