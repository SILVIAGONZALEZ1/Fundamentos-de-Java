package c03_strings;

import java.util.Locale;

public class EjerciciosStrings {
    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String nombre = "Silvia";
        String apellido = "Gonzalez";
        System.out.println(nombre + " " + apellido);

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println("Longitud: " + nombre.length());

        // 3. Muestra el primer y último carácter de un string.
        System.out.println("Primer caracter: " + nombre.charAt(0));
        System.out.println("Ultimo caracter: " + nombre.charAt(nombre.length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println("Mayusculas: " + nombre.toUpperCase());
        System.out.println("Minusculas: " + nombre.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println("Contiene 'via': " + nombre.contains("via"));// true
        System.out.println("Contiene 'xyz': " + nombre.contains("xyz"));// false


        // 6. Formatea un string con un entero.
        var edad = 30;
        var textoFormateado = String.format("Hola, me llamo %s y tengo %d años.", nombre, edad);
        System.out.println(textoFormateado);

        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println("   ".trim() + nombre + "   ".trim());
        String nombreConEspacios = "   " + nombre + "   ";
        System.out.println("Antes: '" + nombreConEspacios + "'");
        System.out.println("Después (trim): '" + nombreConEspacios.trim() + "'");

        // 8. Sustituye todos los espacios en blanco de un string por un guion (-).
        System.out.println("Espacios a guiones: " + nombreConEspacios.replace(" ", "-"));System.out.println("     ".replace(" ","-") + nombre + "      ".replace(" ", "-"));


        // 9. Comprueba si dos strings son iguales.
        String nombre2 = "silvia";
        System.out.println("Iguales (case sensitive): " + nombre.equals(nombre2)); // false, diferentes mayusculas/minusculas
        System.out.println("Iguales (ignore case): " + nombre.equalsIgnoreCase(nombre2)); // true, mismas letras sin importar mayusculas/minusculas


        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println("Misma longitud: " + (nombre.length() == nombre2.length()));// true, ambas tienen 6 caracteres

    }
}