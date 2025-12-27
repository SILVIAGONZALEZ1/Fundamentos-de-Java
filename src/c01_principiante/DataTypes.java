package c01_principiante;

public class DataTypes {

    public static void main(String[] args) {
        // Tipos de datos primitivos en Java

        // Tipo de dato entero
        int numeroEntero = 42;
        System.out.println("Número entero: " + numeroEntero);

        // Tipo de dato de punto flotante
        double numeroDecimal = 3.14;
        System.out.println("Número decimal: " + numeroDecimal);

        // Tipo de dato carácter
        char caracter = 'A'; //la comilla simple es para char
        System.out.println("Carácter: " + caracter);

        // Tipo de dato booleano
        boolean esVerdadero = true; //valor verdadero o falso
        System.out.println("Booleano: " + esVerdadero);

        // Tipo de dato cadena (String)
        String texto = "Hola, Mundo!";//String va entre comillas dobles
        System.out.println("Cadena de texto: " + texto);


        byte byteValue = 100; // Tipo de dato byte 8bits
        short shortValue = 10000; // Tipo de dato short 16bits
        long longValue = 100000L; // Tipo de dato long 64bits
        float floatValue = 5.75f; // Tipo de dato float 32bits
        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);

/*
        byte byteValue = 100;
        Tipo: byte (8 bits, 1 byte).
        Rango (signed): -128 a 127.
        Uso: valores pequeños para ahorrar memoria.
        short shortValue = 10000;
        Tipo: short (16 bits, 2 bytes).
        Rango (signed): -32,768 a 32,767.
        long longValue = 100000L;
        Tipo: long (64 bits, 8 bytes).
        Rango: aproximadamente ±9.22×10^18.
        Nota: la L indica que el literal es long (recomendable usar mayúscula para evitar confusión con 1).
        float floatValue = 5.75f;
        Tipo: float (32 bits, 4 bytes, IEEE 754 precisión simple).
        Precisión: ~7 dígitos decimales; la f indica literal float (por defecto los literales con punto son double).
¿Qué es un bit?
        Bit = dígito binario, unidad mínima de información, puede valer 0 o 1.
        8 bits = 1 byte. El número de bits determina cuántos valores diferentes puede representar (2^n valores para n bits).
                Para tipos con signo en Java se usa complemento a dos; el rango signed de n bits es -2^(n-1) a 2^(n-1)-1 (ej.: 8 bits → -128 a 127).
*/
    }
}
