package c03_strings;

public class Strings {
    public static void main(String[] args) {
        // Cadena de texto

        String name = "Silvia";
        var name2 = "Patricia"; //Inferencia de tipos (Java 10+)

        //Declaracion
        var surname = new String("Gonzalez"); //Objeto de tipo String

        //Operaciones basicas

        //Concatenacion
        System.out.println(name + " " + surname);

        //Longitud
        System.out.println("Longitud: " + name.length());

        //Mayusculas
        System.out.println("Mayusculas: " + name.toUpperCase());

        //Minusculas
        System.out.println("Minusculas: " + name.toLowerCase());

        //Caracter en posicion
        System.out.println("Caracter en posicion 2: " + name.charAt(2));
        System.out.println(name.charAt(name.length() - 1)); //Ultimo caracter

        //Subcadena
        System.out.println("Subcadena (2): " + name.substring(2));//Desde la posicion 2 hasta el final
        System.out.println("Subcadena (1,4): " + name.substring(1, 4));//Desde la posicion 1 hasta la 4 (sin incluirla)

        //Buscar posicion de caracter
        System.out.println("Posicion de 'i': " + name.indexOf('i'));//Primera ocurrencia
        System.out.println("Posicion de 'i' desde 2: " + name.indexOf('i', 2));//Primera ocurrencia desde la posicion 2
        System.out.println("Posicion de 'x': " + name.indexOf('x'));//No existe, devuelve -1

        //Reemplazar caracteres
        System.out.println("Reemplazar 'i' por 'a': " + name.replace('i', 'a'));

        //Eliminar espacios en blanco
        var text = "   Hola   ";
        System.out.println("Texto original: '" + text + "'");
        System.out.println("Texto sin espacios: '" + text.trim() + "'");

        //Comparar cadenas
        // var name2 = "Silvia";
        System.out.println("Comparar '" + name + "' con '" + name2 + "': " + name.equals(name2));//false, diferentes, "Silvia" != "Patricia"
        System.out.println("Comparar ignorando mayusculas: " + name.equalsIgnoreCase(name2));//true, ambas son "Silvia"

        //Convertir a array de caracteres
       /* char[] characters = name.toCharArray();
        System.out.println("Array de caracteres:");
        for (char c : characters) {
            System.out.println(c);
        */

            //Comprobar si contiene la subcadena o parte de ella
            System.out.println("Hola, Java".contains("Java"));//true
            System.out.println("Hola, Java".contains("Brasil"));//false
            System.out.println("Hola, Java".toUpperCase().contains("JAVA"));//true, ignorando mayusculas
            //Nota: contains es sensible a mayusculas y minusculas

            //Comparacion
            System.out.println(name.equals("Silvia")); //true, mismo contenido
            System.out.println(name.equals("silvia")); //false, diferente mayusculas
            System.out.println(name.equalsIgnoreCase("silvia")); //true, ignorando mayusculas

            // == vs.equals
            var a = "Hola";
            var b = "Hola";
            var c = new String("Hola");
            System.out.println(a == b); //true, mismas referencias en memoria
            System.out.println(a == c); //false, diferentes referencias en memoria
            System.out.println(a.equals(c)); //true, mismo contenido

            //Trim
            System.out.println("   Espacios   ".trim()); //Elimina espacios al inicio y final


            //Replace
            System.out.println("bonono".replace('a', 'o')); //bonono
            System.out.println("Hola, me llamo Silvia".replace("Silvia", "Patricia")); //Hola, me llamo Patricia
            System.out.println("aaaa".replace("aa", "b")); //bb

            //format
            var age = 30;
            System.out.println(String.format("Hola, me llamo %s y tengo %d años", name, age)); //Hola, me llamo Silvia y tengo 50 años



    }

}
