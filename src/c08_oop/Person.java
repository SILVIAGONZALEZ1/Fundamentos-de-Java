package c08_oop;

public class Person {  //UpperCamelCase

    //1- Atributos o caracteristicas que tiene el objeto o la clase Person

    String name;
    int age;

    //2- Constructor de clase inicializa el objeto
    //Constructor vacio
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //3- Metodos
    public void sayHello() {
        System.out.println("Hola soy " + name + " y tengo " + age + " años");
    }
}
