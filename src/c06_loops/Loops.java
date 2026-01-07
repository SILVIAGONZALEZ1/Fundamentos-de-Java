package c06_loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {
    static void main(String[] args) {

        System.out.println("Hola, Java!");
        System.out.println("Hola, Java!");
        System.out.println("Hola, Java!");
        System.out.println("Hola, gsdgsdfsJava!");

        //Loops o bucles o ciclos, estructuras de control que permiten repetir un bloque de codigo varias veces
        //for controlador por contador
        for (int i = 0; i < 10; i++) {
            System.out.println("Hola Java! " + i);
        }

        for (int i = -5; i < 15; i++) {
            System.out.println("Hola Java! " + i);
}



        String[] names = {"Ana", "Luis", "Pedro"};
        for (int index = 0; index < 3; index++) {
            System.out.println(names[index]);
        }
            for (int index = 1; index < names.length+1; index++) {
                System.out.println("Nombre: " + names[index-1]);
        }

         //for-each, controlador por elemento
        for (String name : names) {
            System.out.println("Nombre con for-each: " + name);



    }
        HashSet<Integer> numbersSet = new HashSet<>();
        numbersSet.add(10);
        numbersSet.add(20);
        numbersSet.add(30);
        for (Integer number : numbersSet) {
            System.out.println("Número del HashSet: " + number);
        }


        HashMap<String, String> emails = new HashMap<>();
        emails.put("Ana", "anita@gmail.com");
        emails.put("Luis", "luisito@gmail.com");
        emails.put("Pedro", "pedrito@gmail.com");
        for (Map.Entry<String, String> email : emails.entrySet()) {//Recorremos el HashMap con for-each con Map.Entry y con entrySet que devuelve un conjunto de pares clave-valor
            System.out.println("Clave: " + email.getKey() + ", Valor: " + email.getValue());//Otra forma de imprimir clave y valor en una sola linea
            System.out.println("Clave: " + email.getKey());//Imprimimos la clave
            System.out.println("Valor: " + email.getValue());//Imprimimos el valor
        }

        //while, controlador por condicion
        int index = 0;
        while (index < 5) {
            System.out.println("Hola desde while! " + index);
            index++;

        }
        index = 0;
        while (index < names.length) {
            System.out.println("Nombre desde while: " + names[index]);
            index++;
        }
        index = 0;
        boolean find = false;
        while (!find) {
            System.out.println(names[index]);//Imprime el nombre en la posicion index y luego verifica si es "Luis", si es asi, cambia find a true y sale del bucle
            if (names[index].equals("Luis")) {//Compara el nombre en la posicion index con "Luis" y si son iguales, cambia find a true
                // System.out.println("Encontrado a Luis, saliendo del bucle while.");
                find = true;
                // break;
            }
            index++;
        }


        //do-while, controlador por condicion al menos una vez
        index = 0;
        do {
            System.out.println("Hola desde do-while! " + index);
            index++;
        } while (index < 0);//Se ejecuta al menos una vez aunque la condicion sea falsa

        //Control de bucles

        //break
        for (String name : names) {//Recorre el array names
            if (name.equals("Pedro")) {//Compara el nombre con "Pedro"
               // System.out.println("Encuentra a Pedro, saliendo del bucle for.");
                break;//Sale del bucle for cuando encuentra a "Pedro"
            }
            System.out.println("Nombre: " + name);//Imprime todos los nombres hasta encontrar a "Pedro"
        }

        for (int i = 0; i < 5; i++) {
            if (i==3) {
                continue;//Salta la iteracion cuando i es 3
            }
                System.out.println(i);//Imprime los numeros del 0 al 4, pero salta el 3


        }
    }


}






