package c06_loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class EjerciciosLoops {

    static void main(String[] args) {
/*
        // 1. Imprime los números del 1 al 10 usando while.
        int index = 1;
        while (index <=10){
            System.out.println(index);
            index++;
        }
        System.out.println("***************Probanndo con un ArrayList de numeros*****************");
        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        var numeros = new ArrayList<Integer>(); //ArrayList de enteros vacio, notacion moderna
        System.out.println(numeros);
        numeros.add(0);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        System.out.println(numeros);
        System.out.println("Tamano del ArrayList de numeros: " + numeros.size());
        int i = 0;
        do {
            System.out.println(numeros.get(i));
            i++;
        }while (i < numeros.size());

        System.out.println("***********Probando con un ArrayList de String*****************");
        var nombres = new ArrayList<String>();
        System.out.println(nombres);
        nombres.add("Pedro");
        nombres.add("Silvia");
        nombres.add("Marcos");
        System.out.println(nombres);
        System.out.println("Tamano del Arraylist de nombres: " + nombres.size());

        int j = 0;
        do {
            System.out.println(nombres.get(j));
            j++;
        }while (j < nombres.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        for (int k = 0; k <=50 ; k+=5) {
            System.out.println("Imprimiendo los multiplos de 5: " + k);
        }
*/
        // 4. Recorre un Array de 5 números e imprime la suma total.

        int[] num = {10, 20, 30, 40, 50}; // Array de ejemplo
        int suma = 0; // Inicializamos la variable suma

// Recorremos el array desde el índice 0 hasta el final
        for (int p = 0; p < num.length; p++) {
            suma += num[p]; // Sumamos cada elemento a la variable 'suma'
        }

        System.out.println("La suma total es: " + suma); // Imprime: La suma total es: 150



        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        String[] names = {"Ana", "Luis", "Pedro"};//Array de ejemplo con String
        for (int index = 0; index < 3; index++) {
            System.out.println(names[index]);
        }

        //int[] num = {10, 20, 30, 40, 50}; // Array de ejemplo con int, lo comento porque ya esta inicializado mas arriba
        for (int index = 0; index < 5; index++) {
            System.out.println(num[index]);
        }
       // src/c06_loops/EjerciciosLoops.java
       // 6. Usa for-each para recorrer un HashSet y un HashMap.
       HashSet<String> emailSet = new HashSet<>();
       emailSet.add("luis@gmail.com");
       emailSet.add("rosa@gmail.com");
       emailSet.add("manu@gmail.com");
       emailSet.add("ricardo@gmail.com");

       // Recorrer el HashSet
       for (String email : emailSet) {
           System.out.println("Email con for-each: " + email);
       }

       // Convertir HashSet -> HashMap (clave y valor iguales)
       HashMap<String, String> emailMap = new HashMap<>();
       for (String email : emailSet) {
           emailMap.put(email, email);
       }

       // Mostrar resultados
       System.out.println("HashSet: " + emailSet);
       System.out.println("HashMap: " + emailMap);

       // Recorrer el HashMap usando entrySet
       for (var entry : emailMap.entrySet()) {
           System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
       }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("-----Usa continue para saltar los múltiplos de 3 del 1 al 20.-----");
        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        //los multiplos de 3 son 0,3,6,9,12,15,18
        //tiene que salir impreso 1,2,4,5,7,8,10,11,13,14,16,17,19,20
        for (int i = 0; i <= 20 ; i++) {
            if (i % 3 == 0){
                continue;
            }System.out.println(i);
        }

        System.out.println("------Usa break para detener un bucle cuando encuentres un número negativo en un array.");
        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.

        int[] numeritos = {1, 2, 3, 4, -5, 6, 7}; //Array de ejemplo
         //break
        for (int numerito : numeritos) {//Recorre el array numeritos
            if (numerito < 0) {//Compara el numerito menores a 0
               break;//Sale del bucle for cuando encuentra el NUMERO NEGATIVO
            }
            System.out.println("NUMERO: " + numerito);//Imprime todos los numeros hasta encontrar a el NEGATIVO
        }
        System.out.println("----Crea un programa que calcule el factorial de un numero dado");
        // 10. Crea un programa que calcule el factorial de un número dado.

        int n = 7;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
                factorial *= i;
        }
                System.out.println("El factorial del numero--> " + n + " es: " + factorial);
    }}
