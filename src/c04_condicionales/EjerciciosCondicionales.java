package c04_condicionales;

public class EjerciciosCondicionales {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        var age = 20;
        if (age >= 18) {
            System.out.println("Puedes votar");
        } else {
            System.out.println("No puedes votar");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        var num1 = 10;
        var num2 = 20;
        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " es mayor que " + num1);
        } else {
            System.out.println("Los dos números son iguales");
        }
        // 3. Dado un número, verifica si es positivo, negativo o cero.
        var number = -10;
        if (number > 0) {
            System.out.println(number + " es positivo");
        } else if (number < 0) {
            System.out.println(number + " es negativo");
        } else {
            System.out.println("El número es cero");
        }

        // 4. Crea un programa que diga si un número es par o impar.
        var numero = 7;
        if (numero % 2 == 0) {//el operador % devuelve el resto de la division
            System.out.println(numero + " es par");
        } else {
            System.out.println(numero + " es impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        var valor = 50;
        if (valor >= 1 && valor <= 100) {
            System.out.println(valor + " está en el rango de 1 a 100");
        } else {
            System.out.println(valor + " no está en el rango de 1 a 100");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        var dia = 3;
        switch (5) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día no válido");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        var nota = 85;
        if (nota >= 90) {
            System.out.println("Sobresaliente");
        } else if (nota >= 60) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.

        var edadUsuario = 14;
        var acompañado = true;
        if (edadUsuario >= 15 || acompañado) {
            System.out.println("Puedes entrar al cine");
        } else {
            System.out.println("No puedes entrar al cine");
        }
        // 9. Crea un programa que diga si una letra es vocal o consonante.
        char letra = 'j';
        letra = Character.toLowerCase(letra); // Convertir a minúscula para simplificar la comparación
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println(letra + " es una vocal");
        } else if ((letra >= 'b' && letra <= 'z')) {
            System.out.println(letra + " es una consonante");
        } else {
            System.out.println(letra + " no es una letra válida");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        var a = 35;
        var b = 25;
        var c = 200;
        if (a >= b && a >= c) {//
            System.out.println(a + " es el mayor de los tres");
        } else if (b >= a && b >= c) {
            System.out.println(b + " es el mayor de los tres");
        } else {
            System.out.println(c + " es el mayor de los tres");
        }

    }
}
