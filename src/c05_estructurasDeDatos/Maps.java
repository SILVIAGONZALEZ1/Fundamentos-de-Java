package c05_estructurasDeDatos;

import java.util.HashMap;

public class Maps {
    static void main(String[] args) {
        //Mapas o diccionarios, estructura de datos que almacena pares clave-valor
        //Permite acceder a los valores mediante su clave
        //No permite claves duplicadas, pero si valores duplicados

        //Declaracion y creacion de HashMap
        HashMap<String, String> names = new HashMap<>(); //HashMap de String-String vacio, notacion clasica
        var numbers = new HashMap<String, Integer>(); //HashMap de String-Integer


        //Tamaño
        System.out.println("Tamano: " + names.size());

        //Añadir elementos al HashMap
        names.put("Ana", "ana@gmail.com");
        names.put("Luis", "luis@gmail.com");
        names.put("Carlos", "carlos@gmail.com");
        System.out.println("names.size() despues de añadir 3 elementos: " + names.size());
        System.out.println(names);

        //Acceder a los elementos del HashMap
        System.out.println(names.get("Ana"));
        System.out.println(names.get("Developer"));
        System.out.println(names.get("Carlos"));

        //Verificar elementos del HashMap
        System.out.println(names.containsKey("Luis")); //Devuelve true si la clave existe
        System.out.println(names.containsKey("Marta")); //Devuelve false si la clave no existe


        System.out.println(names.containsValue("Ana")); //Devuelve true si el valor existe
        System.out.println(names.containsValue("ana@gmail.com")); //Devuelve false si el valor no existe

        //Eliminar elementos del HashMap
        names.remove("Luis"); //Elimina el elemento con clave "Luis"
        System.out.println("names.size() despues de eliminar un elemento: " + names.size());
        System.out.println(names);

        //Limpiar el HashMap
        names.clear(); //Elimina todos los elementos del HashMap
        System.out.println("Elimina todos los elementos del HashMap " + names);

//Otras operaciones
        names.put("Ana", "Anita@gmail.com"); //Añade el elemento con clave "Ana"
        System.out.println(names);

        names.replace("Ana", "anastacia@gmail.com"); //Modifica el valor de la clave "Ana")
        System.out.println(names);

        names.putIfAbsent("Ana", "Anatolia@gmail.com"); // inserta el valor solo si existe //No modifica el valor porque la clave ya existe
        System.out.println(names);

        //Otras operaciones
        System.out.println("Devuelve true si el HashMap esta vacio: " + names.isEmpty());//Devuelve true si el HashMap esta vacio
        System.out.println("Devuelve una coleccion con todos los valores del HashMap: " + names.values()); //Devuelve una coleccion con todos los valores del HashMap
        System.out.println("Devuelve una coleccion con todas las claves del HashMap: "+ names.keySet()); //Devuelve una coleccion con todas las claves del HashMap


    }
}
