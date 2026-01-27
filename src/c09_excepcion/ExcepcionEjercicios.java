package c09_excepcion;

import java.lang.reflect.Array;
import java.net.PasswordAuthentication;

import c09_excepcion.CustomExcepcion.*;

public class ExcepcionEjercicios {

    public static void main(String[] args) {

        // 1. Divide dos números almacenados en dos variables. Maneja la división por cero con try-catch.
        var num1 = 10;
        var num2 = 0;
        try {
            var resultado = num1 / num2;
            System.out.println("No se puede dividir por cero: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero: " + e.getMessage());
        }


        // 2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el ArrayIndexOutOfBoundsException.
        //Declaracion y creacion de Arrays
        //Array es una estructura de datos estatica, es necesario definir su tamaño inicial
        int [] numeros = new int[3]; //Array de enteros con 3 elementos
        System.out.println("Longitud del array numeros:" + numeros.length);
        try {

            System.out.println("Accediendo al indice 5:" + numeros[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: el índice 5 está fuera del rango del array. " + e.getMessage());
        }


        // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el NullPointerException.
        try { //codigo riesgoso
            var name = "Pepe";
            name = null;
            System.out.println("Longitud del String es: " + name.length());
        } catch (NullPointerException e) {//manejo del error
            System.out.println("La variable String es null " + e.getMessage());
        } finally {//se ejecuta siempre haya error o no
            System.out.println("************Fin del bloque try-catch********************");
        }

         //4. Escribe una función que transforma texto a número.
         //Usa try-catch para manejar entradas no válidas (NumberFormatException).

        textoANumero("123");   // texto que se puede transformar → OK (son numeros pero al estar entre comillas los toma como String
        textoANumero("Pepe");  // texto que NO se puede transformar → excepción


        // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o no error.

        try { //codigo riesgoso
            var name = "josefina";
            System.out.println("todo esta en mayusculas: " + name.toUpperCase());
        } catch (NullPointerException e) {//manejo del error
            System.out.println("La variable String es null " + e.getMessage());//e.getMessage()---> devuelve solo el mensaje
        } finally {//se ejecuta siempre haya error o no
            System.out.println("************Fin del bloque try-catch********************");
        }

        // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido es negativo.
        //throw
        System.out.println("Lanzamiento y captura de excepciones del sistema  ----> throw *********** ");
        try {
            verificarNumero(-555.222);
        } catch (IllegalArgumentException e) {
            System.out.println("Error capturado: " + e.toString());  //e.toString()---> devuelve tipo de excepción + mensaje
        }

        // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada
        // si la temperatura es menor a -50 o mayor a 50.

        //Excepcion personalizada
        try {
            TemperatureChecker checker = new TemperatureChecker();
            checker.checkTemperature(-10);
        } catch (CustomExcepcion e) {
            System.out.println("Error revisando la temperatura: " + e.getMessage());
        }

        // 8. Crea un programa con varios bloques catch: uno para ArithmeticException, otro para ArrayIndexOutOfBoundsException.
        try {
            int[] numero = new int[3];
            //int resultado = 10 / 0;          // ArithmeticException
            int valor = numero[5];         // ArrayIndexOutOfBoundsException

        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: división por cero.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error de índice fuera del rango del array: " + e.getMessage());

        } finally {
            System.out.println("Aquí termina el try con múltiples catch...");
        }

        // 9. Crea una función checkPassword(String pass) que lance una excepción si la contraseña es demasiado corta.

        try {
            checkPassword("abc");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        // 10. Implementa una clase LoginSystem que use una excepción personalizada
        // LoginFailedException si el usuario o contraseña son incorrectos.

        try {
            LoginSystem sistema = new LoginSystem();
            sistema.login("admin", "0000");
        } catch (LoginFailedException e) {
            System.out.println("Error de login: " + e.getMessage());
        }

        System.out.println(" ************ Fin ***************");

    }

    //EJERCICIO 4
    public static void textoANumero(String texto) {
        try {
            int numero = Integer.parseInt(texto); // transforma texto a número
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: no se puede convertir a número el texto: " + texto);
        }
    }

//EJERCICIO 6

    public static void verificarNumero(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo: " + numero);
        } else {
            System.out.println("Número válido: " + numero);
        }
    }

//EJERCICIO 7


    public static class TemperatureChecker {
        public void checkTemperature(int temperatura) throws CustomExcepcion {
            if (temperatura < -50 || temperatura > 50) {
                throw new CustomExcepcion("Temperatura fuera de rango: " + temperatura);
            } else {
                System.out.println("Temperatura valida: " + temperatura);
            }
        }

    }
//EJERCICIO 9
    // 9. Crea una función checkPassword(String pass) que lance una excepción si la contraseña es demasiado corta.


    public static void checkPassword(String pass) {
        if (pass.length() < 6) {
            throw new IllegalArgumentException("La contraseña es demasiado corta. Debe tener al menos 6 caracteres.");
        } else {
            System.out.println("Contraseña válida.");
        }
    }

    //EJERCICIO 10
    // 10. Implementa una clase LoginSystem que use una excepción personalizada
    // LoginFailedException si el usuario o contraseña son incorrectos.
    // Excepción personalizada
    public static class LoginFailedException extends Exception {
        public LoginFailedException(String mensaje) {
            super(mensaje);
        }
    }

    // Clase LoginSystem
    public static class LoginSystem {

        public void login(String usuario, String password) throws LoginFailedException {
            String usuarioCorrecto = "admin";
            String passwordCorrecta = "1234";
            if (!usuario.equals(usuarioCorrecto) || !password.equals(passwordCorrecta)) {
                throw new LoginFailedException("Usuario o contraseña incorrectos.");
            } else {
                System.out.println("Login exitoso. Bienvenido " + usuario);
            }
        }
    }



}