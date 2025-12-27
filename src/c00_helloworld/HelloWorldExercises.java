package c00_helloworld;

public class HelloWorldExercises {

    // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".

    public static void main() {
        // Esta línea imprime un mensaje de saludo con mi nombre.
        System.out.println("¡Hola, me llamo Silvia!");


        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        // Esta línea imprime "Hola" y "Mundo" en dos líneas separadas.
        System.out.println("Hola\nMundo");


        // 3. Añade un comentario sobre lo que hace cada línea del programa.


        // 4. Crea un comentario en varias líneas.

        /* * Este es un comentario
         * de varias líneas
         * que explica el propósito del programa.
         */

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        // Esta línea imprime mi edad, color favorito y ciudad.
        System.out.println("Tengo 50 años, mi color favorito es el rojo y vivo en Mendoza.");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".

        System.err.println("Este es un mensaje de error.");
        // Esta línea utiliza System.err para imprimir un mensaje de error.

        System.out.println("Este es un mensaje normal.");
        // Esta línea utiliza System. out para imprimir un mensaje normal.


        // Esta línea utiliza System.in para leer entrada del usuario (no se imprime nada).
        // System.in no tiene un método println, ya que es para entrada, no para salida.

        System.gc();
        // Esta línea utiliza System.gc() para sugerir al recolector de basura que libere memoria.
        // Llama al recolector de basura (no imprime nada).


        System.console();
        // No tiene un método println, ya que es para interactuar con la consola.


        System.currentTimeMillis();
        // Esta línea obtiene el tiempo actual en milisegundos (no imprime nada).
        //  System.currentTimeMillis() no tiene un método println, ya que es para obtener información, no para imprimir.

        //System.getLogger();
        // Esta línea obtiene un logger del sistema (no imprime nada).
        // System.getLogger() no tiene un método println, ya que es para obtener un logger

        //System.clearProperty();
        // Esta línea borra una propiedad del sistema (no imprime nada).
        // System.clearProperty() no tiene un método println, ya que es para manipular propiedades, no para imprimir.

        //System.arraycopy();
        // Esta línea copia un array a otro (no imprime nada).
        // System.arraycopy() no tiene un método println, ya que es para manipular arrays, no para imprimir.

        //System.getenv();
        // Esta línea obtiene las variables de entorno del sistema (no imprime nada).
        // System.getenv() no tiene un método println, ya que es para obtener información, no para imprimir.


        //System.identityHashCode();
        // Esta línea obtiene el código hash de un objeto (no imprime nada).
        // System.identityHashCode() no tiene un método println, ya que es para obtener información, no para imprimir.

        //System.inheritedChannel();
        // Esta línea obtiene el canal heredado del sistema (no imprime nada).
        // System.inheritedChannel() no tiene un método println, ya que es para obtener información, no para imprimir.

        //System.lineSeparator();
        // Esta línea obtiene el separador de líneas del sistema (no imprime nada).
        // System.lineSeparator() no tiene un método println, ya que es para obtener información, no para imprimir.




        // 7. Utiliza varios println para imprimir una frase.

        System.out.println("La");
        System.out.println("vida");
        System.out.println("es");
        System.out.println("bella.");



        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        // Esta línea imprime una cara feliz en ASCII art.
        System.out.println("  _____  ");
        System.out.println(" /     \\ ");
        System.out.println("|  0 0  |");
        System.out.println("|   ^   |");
        System.out.println("|  |__| |");
        System.out.println(" \\_____/ ");



        // 9. Intenta ejecutar el programa sin el método main y observa el error.
// El programa no se ejecutará y mostrará un error indicando que no se encontró el método main.



    }

  //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
    // El programa no se compilará y mostrará un error indicando que el nombre del archivo debe coincidir con el nombre de la clase pública.
    //java: class HelloWorldExercise is public, should be declared in a file named HelloWorldExercise.java
}
