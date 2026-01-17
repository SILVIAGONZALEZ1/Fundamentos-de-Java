package c08_oop;

import java.util.ArrayList;

public class ClassesEjercicios {
    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        var book = new Book("La insoportable levedad del ser", "Kundera");
        // book.title ="La insportable levedad del ser";
        // book.author= "Kundera";
        book.mostrarDatos();

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        var dog = new Dog("Guau Guau");
        //dog.sonido = "Guau Guau"; //asi no sería prudente pasar los parámetros, mejor hacemos constructor
        dog.bark();

        // 3. Añade un constructor a la clase Book que reciba title y author.

        // 4. Crea una clase Car con atributos brand y model y un método showData().
        //var car = new Car("Tesla", "Modelo Y");
        // car.marca = "Tesla";
        // car.modelo = "Modelo Y";
        //car.showData();


        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
//        var student = new Student();
//        student.score = 60;
//        student.rendir();

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        var cuenta = new BankAccount(1000);
        cuenta.deposit(500);
        System.out.println("Saldo actual: " + cuenta.getBalance());


        // 7. Crea una clase Rectangulo con métodos para calcular el área y el perímetro.
        var rectangulo = new Rectangulo(10, 2);
        rectangulo.area();
        rectangulo.perimetro();

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        var trabajador =  new Worker();
        trabajador.cargarDatos();
        trabajador.mostrarSalario();

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        //Declaracion y creacion de ArraysList
        //ArrayList es una estructura de datos dinamica, no es necesario definir su tamaño inicial
        ArrayList<Person> personas = new ArrayList<>();

        // Crear varios objetos Person
//        var p1 = new Person("Ana", 25 , "40123654E");
//        var p2 = new Person("Luis", 30, "50654789C");
//        var p3 = new Person("María", 40, "78996541B");

        // Guardarlos en el ArrayList
//        personas.add(p1);
//        personas.add(p2);
//        personas.add(p3);

        // Mostrar la lista
        for (Person p : personas) {
            System.out.println(p);
        }


        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        var producto = new Product(1000);
        producto.descuento();





    }
}
