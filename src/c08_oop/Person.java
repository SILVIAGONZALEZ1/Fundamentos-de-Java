package c08_oop;

public class Person {  //UpperCamelCase
// 1. Crea una clase Person con atributos privados name y age.
// Usa los métodos getName(), setName(), getAge() y setAge()
// para asignar y mostrar valores desde otra clase.

    //1- Atributos o caracteristicas que tiene el objeto o la clase Person
    protected String name;
    protected int age;
    //final private int ID; // Aca se declara como una constante por eso colocamos final osea no se puede modificar
   // private String id;


    //2- Constructor de clase inicializa el objeto
    //Constructor vacio
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        //this.id = id;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//    public String getId() {
//        return id;
//    }


    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Edad no valida");
        }
    }

//    public void setId(String id) {
//        this.id = id;
//    }


    //3- Metodos
//    public void sayHello() {
//        System.out.println("Hola soy " + name + " y tengo " + age + " años y mi id es " + this.id);
//    }
//
//    //Metodo usando ---> toString() es un método de Java que sirve para convertir un objeto en texto.
//    public String toString() {
//        return "Nombre: " + this.name + ", Edad: " + this.age + this.id;
//    }
}