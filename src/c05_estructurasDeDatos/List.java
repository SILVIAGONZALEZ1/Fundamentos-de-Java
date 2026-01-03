package c05_estructurasDeDatos;

import java.util.ArrayList;

public class List {
    static void main(String[] args) {

        //Declaracion y creacion de ArraysList
        //ArrayList es una estructura de datos dinamica, no es necesario definir su tamaño inicial
        ArrayList <String> nombres = new ArrayList<>(); //ArrayList de Strings vacio, notacion clasica
        var numeros = new ArrayList<Integer>(); //ArrayList de enteros vacio, notacion moderna


         //Tamaño inicial del ArrayList

        nombres.size(); //Devuelve el numero de elementos en el ArrayList
        System.out.println("Tamaño inicial del ArrayList nombres: " + nombres.size());

        //Añadir elementos al ArrayList
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");
        nombres.add("Marta");
        System.out.println("Tamaño del ArrayList nombres despues de añadir 4 elementos: " + nombres.size());

        //Acceder a los elementos del ArrayList
        System.out.println(nombres.getFirst());
        System.out.println(nombres.get(1));
        System.out.println(nombres.get(2));
        System.out.println(nombres.getLast());


        //Modificar elementos del ArrayList
        nombres.set(2, "Pampito");
        System.out.println(nombres.get(2));

        //Eliminar elementos del ArrayList
        nombres.remove(1); //Elimina el elemento en el indice 1
        System.out.println("Tamaño del ArrayList nombres despues de eliminar un elemento: " + nombres.size());


        //Buscar elementos en el ArrayList
        //Busca mas rapido si el ArrayList esta ordenado, pero no es obligatorio
        nombres.contains("Ana"); //Devuelve true si el elemento esta en el ArrayList
        System.out.println(nombres.contains("Ana"));
        nombres.contains("Luis"); //Devuelve false si el elemento no esta en el ArrayList
        System.out.println(nombres.contains("Luis"));


        //Limpiar el ArrayList
        System.out.println("Tamaño del ArrayList nombres despues de limpiarlo: " + nombres);


        nombres.clear(); //Elimina todos los elementos del ArrayList
        System.out.println("Tamaño del ArrayList nombres despues de limpiarlo: " + nombres.size());


    }
}
