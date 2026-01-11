package c07_funciones;

import java.util.ArrayList;

public class EjerciciosFunciones {
    public static void main(String[] args) {

        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
        for (int i = 0; i < 1; i++) {
            imprimir();
            saludar("Guillermina");
            restar(10, 3);
            cuadradoDeUnNumero(7);
            parImpar(17);
            age(99);
            longitudCadena("hipopotamo");

            int[] valores = {10, 20, 30, 40};
            calcularMedia(valores);

            factorial(7);

            ArrayList<String> nombres = new ArrayList<>();
            nombres.add("Ana");
            nombres.add("Luis");
            nombres.add("Pedro");

            mostrarElementos(nombres);

        }
    }

    public static void imprimir() {
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }


    // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
    public static void saludar(String name) {
        System.out.println("Hola " + name + " que bueno que estes aprendiendo Java");
    }


    // 3. Haz un método que reciba dos números enteros y devuelva su resta.
    public static void restar(int num1, int num2) {
        System.out.println("La resta de dos numeros enteros " + num1 + " - " + num2 + " es = " + (num1 - num2));
    }


    // 4. Crea un método que calcule el cuadrado de un número (n * n).
    public static void cuadradoDeUnNumero(int num1) {
        System.out.println("El cuadrado de " + num1 + " es = " + (num1 * num1));
    }


    // 5. Escribe una función que reciba un número y diga si es par o impar.
    public static boolean parImpar(int num1) {
        if (num1 % 2 == 0) { //se usa el operador módulo %
            System.out.println("el numero " + num1 + " es PAR ");
            return true;
        } else {
            System.out.println("el numero " + num1 + " es IMPAR ");
            return false;
        }

    }


    // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
    public static boolean age(int num1) {
        if (num1 >= 18) { //se usa el operador modulo %
            System.out.println("el numero " + num1 + " es mayor de edad ");
            return true;
        } else {
            System.out.println("el numero " + num1 + " es menor de edad ");
            return false;
        }

    }


    // 7. Implementa una función que reciba una cadena y retorne su longitud.
    public static void longitudCadena(String cadena) {
        System.out.println("La longitud de la cadena " + "(" + cadena + ")" + " es= " + (cadena.length()));
    }


    //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
    public static double calcularMedia(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            System.out.println("El array está vacío o es nulo");
            return 0;
        }

        int suma = 0;
        for (int n : numeros) {         //significa:“Para cada número n en el array numeros…” Es un for-each.
            suma += n;               // No usa índices, va tomando directamente cada valor del arreglo.
        }                            //Los dos puntos indican que n va a recorrer todos los elementos que están dentro de numeros, uno por uno.

        double media = (double) suma / numeros.length;
        System.out.println("La media es: " + media);

        return media;
    }


    // 9. Escribe un método que reciba un número y retorna su factorial.
    public static long factorial(int n) {
        long resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
        }

        System.out.println("El factorial de " + n + " es: " + resultado);
        return resultado;
    }


    // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.

    public static void mostrarElementos(ArrayList<String> lista) {
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }


}






