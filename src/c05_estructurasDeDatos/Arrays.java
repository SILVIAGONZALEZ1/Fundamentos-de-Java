package c05_estructurasDeDatos;

public class Arrays {
    static void main(String[] args) {
        //Declaracion y creacion de Arrays
        //Array es una estructura de datos estatica, es necesario definir su tamaño inicial
       int [] numeros = new int[5]; //Array de enteros con 5 elementos
        System.out.println("Longitud del array numeros: " + numeros.length);



        String [] nombres = {"Ana", "Luis", "Carlos", "Marta", "Sofia"}; //Array de Strings con inicializacion
        System.out.println("Longitud del array nombres: " + nombres.length);

        //Acceso
        System.out.println("Elemento en el indice 2 del array nombres: " + nombres[2]);
        System.out.println("Elemento en el indice 4 del array numeros: " + numeros[4]);

        System.out.println((new String[3])[0]);//Acceso a un array temporal creado en la misma linea

        //Modificacion
       numeros[0] = 1;
       numeros[1] = 10;
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);

        numeros[2] = 2;
        System.out.println(numeros[2]);


        nombres[1] = "Luis Miguel";
        System.out.println(nombres[1]);
        nombres[1] = "null";
        System.out.println(nombres[1]);
        System.out.println(nombres.length);

        //numeros[2] = null; //Error de compilacion: incompatible types: int cannot be converted to Integer

boolean[] valoresBooleanos = new boolean[5];
        System.out.println(valoresBooleanos[4]); //Imprime false, valor por defecto de boolean
    }
}
