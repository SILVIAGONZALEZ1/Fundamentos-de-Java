package c05_estructurasDeDatos;

import java.util.HashSet;

public class Sets {
    static void main(String[] args) {
        //HashSet, estructura de datos que no permite elementos duplicados y no mantiene un orden fijo
        //almacena datos unicos, no permite elementos repetidos,busca mas rapido que un ArrayList


        //Declaracion y creacion de HashSet

        HashSet<String> names = new HashSet<>(); //HashSet de Strings vacio, notacion clasica
        var numbers = new HashSet<Integer>(); //HashSet de enteros vacio, notacion moderna


        //Tamaño
        System.out.println("Tamaño inicial del HashSet names: " + names.size()) ;

        //Añadir elementos al HashSet
        names.add("Ana");
        names.add("Luis");
        names.add("Carlos");
        names.add("Marta");
        System.out.println("Tamaño del HashSet: " + names.size());

        //Acceder a los elementos del HashSet
        //los Set no permiten acceder a los elementos por indice o de forma ordenada
        //No se puede acceder a los elementos por indice, HashSet no mantiene un orden fijo
        //System.out.println(names.getFirst());
        //System.out.println(names.get(1));
        //System.out.println(names.get(2));
        //System.out.println(names.getLast());

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("Tamaño del HashSet numbers: " + numbers.size());


        //Eliminar elementos del HashSet
        names.remove("Luis"); //Elimina el elemento "Luis"
        System.out.println("Tamaño del HashSet names despues de eliminar un elemento: " + names.size());


        //Buscar elementos en el HashSet
        //Busca mas rapido que en un ArrayList
        names.contains("Ana");
        System.out.println(names.contains("Ana"));
        names.contains("Luis");
        System.out.println(names.contains("Pampito"));


        System.out.println(names);
        names.add("Ana"); //No se añade porque ya existe
        names.add("Ana");
        names.add("Ana");
        System.out.println(names);


        //Conjuntos matematicos con HashSet

        //names.addAll(numbers); //Union de dos conjuntos
        //System.out.println("Union de names y numbers: " + names);   //Error: incompatible types: HashSet<Integer> cannot be converted to HashSet<String>

        var countries = new HashSet<String>();
        countries.add("España");
        countries.add("Francia");
        countries.add("Italia");
        System.out.println("Conjunto countries: " + countries);

        //Interseccion de dos conjuntos
        countries.retainAll(names);
        System.out.println("Interseccion de names y countries: " + countries);

        //Diferencia de dos conjuntos
        names.removeAll(countries);
        System.out.println("Diferencia de names y countries: " + names);

        //Limpiar el HashSet
        names.clear();
        System.out.println("Tamaño del HashSet names despues de limpiarlo: " + names.size());
    }





}
