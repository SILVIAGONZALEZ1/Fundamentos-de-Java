package c02_operadores;

public class EjerciciosOperadores {

    static void main() {

        // 1. Crea una variable con el resultado de cada operación aritmética.


        var a = 10;
        var b = 3;

        var suma = a + b;
        var resta = a - b;
        var multiplicacion = a * b;
        var divisionEntera = a / b;                // división entera (int)
        var divisionDecimal = (double) a / b;      // división con decimales
        var modulo = a % b;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División (entera): " + divisionEntera);
        System.out.println("División (decimal): " + divisionDecimal);
        System.out.println("Módulo: " + modulo);

        // 2. Crea una variable para cada tipo de operación de asignación.
        var c = 5;
        System.out.println("Valor inicial de c: " + c);
        c = 10; // Asignación simple
        System.out.println("Después de c = 10: " + c);
        c += 5; // c = c + 5
        System.out.println("Después de c += 5: " + c);
        c -= 3; // c = c - 3
        System.out.println("Después de c -= 3: " + c);
        c *= 2; // c = c * 2
        System.out.println("Después de c *= 2: " + c);
        c /= 4; // c = c / 4
        System.out.println("Después de c /= 4: " + c);
        c %= 3; // c = c % 3
        System.out.println("Después de c %= 3: " + c);


        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println("a es mayor que b: " + (a > b));//true
        System.out.println("a es mayor o igual que b: " + (a >= b));//true
        System.out.println("a es diferente a b: " + (a != b));//true

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println("a es menor que b: " + (a < b));//false
        System.out.println("a es menor o igual que b: " + (a <= b));//false
        System.out.println("a es igual a b: " + (a == b));//false

        // 5. Utiliza el operador lógico and.
        System.out.println((a > b) && (b > 0)); //true
        System.out.println((a > 0) && (b < 5)); //true
        System.out.println((a == 10) && (b == 3)); //true


        // 6. Utiliza el operador lógico or.
        System.out.println((a < b) || (b > 0)); //true
        System.out.println((a > 0) || (b > 5)); //true
        System.out.println((a == 5) || (b == 3)); //true

        // 7. Combina ambos operadores lógicos.
        System.out.println(((a > b) && (b > 0)) || (a == 0)); //true
        System.out.println(((a < b) || (b > 0)) && (a == 10)); //true
        System.out.println(((a > b) && (b < 5)) || (a == 5)); //true

        // 8. Añade alguna negación.
        System.out.println(!((a < b) || (b > 0))); //false
        System.out.println(!((a > b) && (b < 5))); //false
        System.out.println(!((a == 5) || (b == 3))); //false

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        System.out.println("Valor original de a: " + a);
        System.out.println("Valor de a después del incremento: " + (++a)); // pre-incremento
        System.out.println("Valor de a después del decremento: " + (--a)); // pre-decremento


        // 10. Combina operadores aritméticos, de comparación y lógicos.
        var resultado = ((a + b) > 10) && ((a - b) < 5);
        System.out.println("El resultado de la combinación es: " + resultado);



    }


}








