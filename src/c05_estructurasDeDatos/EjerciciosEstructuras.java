package c05_estructurasDeDatos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;


public class EjerciciosEstructuras {
    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        String[] names = {"Ana", "Luis", "Carlos", "Marta", "Sofia"}; //Array de Strings con inicializacion
        System.out.println("Longitud del array nombres: " + names.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println("Elemento en el indice 2 original del array nombres es:  " + names[2]);
        names[2] = "Marley";
        System.out.println("Elemento en el indice 2 modificado del array es:  " + names[2]);

        // 3. Crea un ArrayList vacío.
        ArrayList<String> nombres = new ArrayList<>(); //ArrayList de Strings vacio, notacion clasica
        System.out.println("Tamaño inicial del ArrayList nombres: " + nombres.size());

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        nombres.add("Pedro");
        nombres.add("Martin");
        nombres.add("Mariana");
        nombres.add("Carolina");
        System.out.println("Tamaño del ArrayList nombres despues de añadir 4 elementos: " + nombres.size());
        System.out.println(nombres);

        nombres.remove(1); //Elimina el elemento en el indice 1
        System.out.println("Tamaño del ArrayList nombres despues de eliminar un elemento: " + nombres.size());
        System.out.println(nombres);

        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<String> apellidoSet = new HashSet<String>(); //HashSet de Strings vacio, notacion clasica
        apellidoSet.add("Gonzalez");
        apellidoSet.add("Perez");
        System.out.println("Tamaño del HashSet: " + apellidoSet.size());
        System.out.println(apellidoSet);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.

        apellidoSet.add("Gonzalez"); //No se añade porque ya existe
        apellidoSet.add("Rodriguez");
        System.out.println("Tamaño del HashSet despues de intentar añadir un repetido y uno nuevo: " + apellidoSet.size());
        System.out.println(apellidoSet);

        // 7. Elimina uno de los elementos del HashSet.

        apellidoSet.remove("Perez"); //Elimina el elemento "Perez"
        System.out.println("Tamaño del HashSet despues de eliminar un elemento: " + apellidoSet.size());
        System.out.println(apellidoSet);


        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        HashMap<String, Integer> contactos = new HashMap<>(); //HashMap de String-Integer vacio, notacion clasica
        System.out.println("Tamano inicial del HashMap contactos: " + contactos.size());
        contactos.put("Ana", 261345678);
        contactos.put("Luis", 261654321);
        contactos.put("Carlos", 261666777);
        System.out.println("contactos.size() despues de añadir 3 elementos: " + contactos.size());
        System.out.println(contactos);


        // 9. Modifica uno de los contactos y elimina otro.
        contactos.replace("Luis", 261111222); //Modifica el valor de la clave "Luis")
        System.out.println("contactos despues de modificar el numero de Luis: " + contactos);
        contactos.remove("Carlos"); //Elimina el elemento con clave "Carlos"
        System.out.println("contactos.size() despues de eliminar un elemento: " + contactos.size());
        System.out.println(contactos);

        /* 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y
               finalmente en un HashMap con clave y valor iguales.*/
       /* String[] arrayInicial = {"A", "B", "C", "D", "E"};//Array de Strings con inicializacion
        System.out.println("Array inicial: ");
        for (String s : arrayInicial) {
            System.out.print(s + " ");//Imprime los elementos del array
        // Transformaciones: Array -> ArrayList -> HashSet -> HashMap (clave = valor)
        ArrayList<String> lista = new ArrayList<>(java.util.Arrays.asList(arrayInicial));
        System.out.println("\nArrayList resultante: " + lista);

        HashSet<String> conjunto = new HashSet<>(lista);
        System.out.println("HashSet resultante: " + conjunto);

        HashMap<String, String> mapaIgual = new HashMap<>();
        for (String s : conjunto) {
            mapaIgual.put(s, s);
        }
        System.out.println("HashMap (clave=valor) resultante: " + mapaIgual);*/

        // PASO 1: Array
        String[] array = {"Java", "Python", "Java", "C++"};//Array con un valor duplicado

        // PASO 2: Array -> ArrayList
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));//Convierte el array en una lista y la pasa al ArrayList

        // PASO 3: ArrayList -> HashSet
        HashSet<String> hashSet = new HashSet<>(arrayList);//Elimina duplicados

        // PASO 4: HashSet -> HashMap
        HashMap<String, String> hashMap = new HashMap<>();// clave y valor iguales
        for (String elemento : hashSet) {//Itera sobre los elementos del HashSet
            hashMap.put(elemento, elemento);//Añade el elemento como clave y valor en el HashMap
        }

        // Mostrar resultados
        System.out.println("Array: " + Arrays.toString(array));//Imprime la referencia del array, no los elementos
        System.out.println("ArrayList: " + arrayList);//Imprime los elementos del ArrayList
        System.out.println("HashSet: " + hashSet);//Imprime los elementos del HashSet
        System.out.println("HashMap: " + hashMap);//Imprime los elementos del HashMap


    }
    }
