package c08_oop;

import java.util.Scanner;

public class Worker {
    // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
    //Atributos
    String nombre;
    double salario;


    //Constructor
    public Worker() {
        this.nombre = nombre;
        this.salario = salario;
    }

    //Metodo para cargar datos desde teclado
    public void cargarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del trabajador: ");
        nombre = sc.nextLine();

        System.out.println("ingrese el salario: ");
        salario = sc.nextDouble();
    }


    //Metodo para mostrar salario
    public void mostrarSalario(){
        System.out.println("mi nombre es " + this.nombre + " y mi salario es $ " + this.salario);
    }

/*
Scanner es una clase de Java que sirve para leer datos de entrada.
 Principalmente se usa para leer lo que el usuario escribe por teclado,
  pero también puede leer desde archivos o strings.
 */



}
