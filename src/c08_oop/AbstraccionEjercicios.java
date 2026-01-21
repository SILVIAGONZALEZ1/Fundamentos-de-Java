package c08_oop;

public class AbstraccionEjercicios {
    public static void main(String[] args) {

        // 1. Crea una clase abstracta Shape con el m&eacute;todo calculateArea().
        //  Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia &aacute;rea.
        var circulo = new Circulo(90);
        circulo.calculateArea();

        var rectangulo = new Rectangulo(5, 6);
        rectangulo.calculateArea();

        // 2. Crea una interfaz Playable con el m&eacute;todo play().
        //  Luego implementa esa interfaz en dos clases: Guitar y Piano.
        //  Cada una debe mostrar un mensaje diferente al ejecutarse.

        var guitarra = new Guitar();
        guitarra.play();

        var piano = new Piano();
        piano.play();

        // 3. Define una clase abstracta Animal con el m&eacute;todo makeSound().
        //  Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.
        Animal[] animales = new Animal[2];
        animales[0] = new Dog();
        animales[1] = new Cat();

        for (Animal a : animales) {
            System.out.println(a.makeSound()); // polimorfismo
        }

        // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle
        // que muestren como se dibuja cada figura usando draw().
        var circulito = new Circle();
        circulito.draw();

        var cuadrado = new Square();
        cuadrado.draw();

        var triangulo = new Triangle();
        triangulo.draw();

        // 5. Crea una clase abstracta Employee con un m&eacute;todo calculateSalary().
        //  Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.
        Employee emp1 = new FullTimeEmployee(3000, 160);
        Employee emp2 = new PartTimeEmployee(3000, 80);

        System.out.println("Salario Full Time: " + emp1.calculateSalary());
        System.out.println("Salario Part Time: " + emp2.calculateSalary());


        // 6. Crea una interfaz Movable con el m&eacute;todo move().
        //  Haz que las clases Car y Robot implementen ese m&eacute;todo con comportamientos diferentes.
        var auto = new Car();
        auto.move();

        var robot = new Robot();
        robot.move();

        // 7. Crea una clase abstracta Appliance con m&eacute;todo turnOn() y turnOff().
        //  Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.
        var tv = new TV();
        var lavadora = new WashingMachine();

        tv.turnOff();
        lavadora.turnOn();

        // 8. Crea dos interfaces Flyable y Swimmable.
        // Crea una clase Duck que implemente ambas interfaces y muestre como puede volar y nadar.
        var pato = new Duck();
        pato.nadar();
        pato.volar();

        // 9. Crea una clase abstracta Document con el método print().
        //  Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.
        var pdf = new PDFDocument();
        pdf.print();

        var word = new WordDocument();
        word.print();

        // 10. Crea una interfaz Payable con el método pay().
        //  Luego implementa las clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago diferente.

        var invoice = new Invoice();
        invoice.pay();

        var empleado = new EmployeePayment();
        empleado.pay();



    }//*****************************fin de la MAIN************************************

    //Ejercicio 1
    //Clase padre Shape
    public static abstract class Shape {

        // Método abstracto (sin implementación)
        public abstract double calculateArea();

    }

    public static class Circulo extends Shape {
        //Atributos
        final private double radio;

        //Constructor
        public Circulo(double radio) {
            this.radio = radio;
        }

        //Sobreescribe el m&eacute;todo padre
        @Override
        public double calculateArea() {
            double area = Math.PI * radio * radio;
            System.out.println("Area del Circulo: " + area);
            return area;
        }
    }

    //@Override  //mas simple
    //public double calculateArea() {
    //    return this.base * this.altura;
    //}
    public static class Rectangulo extends Shape {
        // Atributos
        final private double base;
        final private double altura;

        //Constructor
        public Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        //Sobreescribe el método padre
        @Override
        public double calculateArea() {
            double area = this.base * this.altura;
            System.out.println("El Area es: " + area);
            return area;

        }
        //@Override  //mas simple
        //public double calculateArea() {
        //    return this.base * this.altura;
        //}
    }

    // 2. Crea una interfaz Playable con el m&eacute;todo play().
    //  Luego implementa esa interfaz en dos clases: Guitar y Piano.
    //  Cada una debe mostrar un mensaje diferente al ejecutarse.
    public interface Playable {
        //Metodo
        public void play();
    }

    public static class Guitar implements Playable {

        @Override
        public void play() {
            System.out.println("La guitarra tiene cuerdas ...");
        }
    }

    public static class Piano implements Playable {

        @Override
        public void play() {
            System.out.println("El Piano tiene teclas... ");
        }
    }

    // 3. Define una clase abstracta Animal con el m&eacute;todo makeSound().
    //  Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.

    public static abstract class Animal {

        // M&eacute;todo abstracto (sin implementación)
        public abstract String makeSound();
    }

    public static class Dog extends Animal {

        @Override
        public String makeSound() {
            return "El perro hace Guau Guau";
        }
    }

    public static class Cat extends Animal {

        @Override
        public String makeSound() {
            return "El gato hace Miau Miau";
        }
    }

    // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle
    // que muestren como se dibuja cada figura usando draw().
    public interface Drawable {

        public void draw();
    }

    public static class Circle implements Drawable {

        @Override
        public void draw() {
            System.out.println("Dibujando un Circulo");
        }
    }

    public static class Square implements Drawable {

        @Override
        public void draw() {
            System.out.println("Dibujando un Cuadrado");
        }
    }

    public static class Triangle implements Drawable {

        @Override
        public void draw() {
            System.out.println("Dibujando un Triangulo");
        }
    }
    // 5. Crea una clase abstracta Employee con un m&eacute;todo calculateSalary().
    //  Implementa FullTimeEmployee y PartTimeEmployee con logica diferente para calcular el salario.

    public static abstract class Employee {
        public abstract double calculateSalary();
    }

    public static class FullTimeEmployee extends Employee {
        final private double precioPorHora;
        final private double horas;

        public FullTimeEmployee(double precioPorHora, double horas) {
            this.precioPorHora = precioPorHora;
            this.horas = horas;
        }

        @Override
        public double calculateSalary() {
            return horas * precioPorHora;
        }
    }

    public static class PartTimeEmployee extends Employee {
        final private double precioPorHora;
        final private double horas;

        public PartTimeEmployee(double precioPorHora, double horas) {
            this.precioPorHora = precioPorHora;
            this.horas = horas;
        }

        @Override
        public double calculateSalary() {
            return precioPorHora * horas;
        }
    }

    /// 6. Crea una interfaz Movable con el m&eacute;todo move().
    /// Haz que las clases Car y Robot implementen ese m&eacute;todo con comportamientos diferentes.
    public interface Movable {
        public void move();
    }

    public static class Car implements Movable {

        @Override
        public void move() {
            System.out.println("El auto se mueve");
        }
    }

    public static class Robot implements Movable {

        @Override
        public void move() {
            System.out.println("El robot se mueve");
        }
    }

    // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff().
    //  Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.
    public static abstract class Appliance {
        public abstract void turnOn();

        public abstract void turnOff();
    }

    public static class TV extends Appliance {


        @Override
        public void turnOn() {
            System.out.println("TV encendida");
        }

        @Override
        public void turnOff() {
            System.out.println("TV apagada");
        }
    }

    public static class WashingMachine extends Appliance {


        @Override
        public void turnOn() {
            System.out.println("Lavadora encendida");
        }

        @Override
        public void turnOff() {
            System.out.println("Lavadora apagada");
        }
    }


    // 8. Crea dos interfaces Flyable y Swimmable.
    // Crea una clase Duck que implemente ambas interfaces y muestre como puede volar y nadar.

    public interface Flyable {
        public void volar();
    }

    public interface Swimmable {
        public void nadar();
    }

    public static class Duck implements Flyable, Swimmable {
        @Override
        public void volar() {
            System.out.println("El pato esta volando");
        }

        @Override
        public void nadar() {
            System.out.println("el pato esta nadando");
        }
    }
    // 9. Crea una clase abstracta Document con el método print().
    //  Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.
    public static abstract class Document{
        public abstract void print();
    }

    public static class PDFDocument extends Document{

        @Override
        public void print() {
            System.out.println("El documento PDF se imprime rapido");
        }
    }
    public static class WordDocument extends Document{

        @Override
        public void print() {
            System.out.println("El documento Word se imprime mas lento");
        }
    }

    // 10. Crea una interfaz Payable(pagadero) con el método pay().
    //  Luego implementa las clases Invoice(cuenta de cobro) y EmployeePayment(Pago de empleados), cada una mostrando un mensaje de pago diferente.
    public interface Payable{
        public void pay();
    }
    public static class Invoice implements Payable{

        @Override
        public void pay() {
            System.out.println("el pago esta para abonar a la cuenta de cobro");
        }
    }
    public static class EmployeePayment implements Payable{

        @Override
        public void pay() {
            System.out.println("El pago a empleados esta retrasado");
        }
    }

    //***********************termina la clase***********
}