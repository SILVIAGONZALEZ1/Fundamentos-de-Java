package c08_oop;

import java.util.ArrayList;

public class PolimorfismoEjercicios {
    public static void main(String[] args) {
   /*     ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Dog());
        animales.add(new Cat());
        animales.add(new Cow());

        for (Animal a : animales) {
            a.makeSound();   // polimorfismo en acción
        }
//************************************************
        //Ejercicio 2
        ArrayList<Shape> figuras = new ArrayList<>();

        figuras.add(new Circulo(5));
        figuras.add(new Rectangulo(4, 3));
        figuras.add(new Circulo(2.5));
        figuras.add(new Rectangulo(10, 25));//se agregan varios objetos para rellenar el ArrayList

        for (Shape s : figuras) {
            System.out.println("Área: " + s.calculateArea());
        }
        //*************************************
        //Ejercicio 3

        var imprimir = new Printer();
        imprimir.print("Practicando polimorfismo");
        imprimir.print(5);
        imprimir.print(2.33);

        //*************************************
        //Ejercicio 4
        var voluntario = new Greeter();
        voluntario.greet("Pepe");
        //*************************************

        //Ejercicio 5
        var vehiculo = new Vehicle();
        vehiculo.start();

        ArrayList<Vehicle> vehiculos = new ArrayList<>();

        vehiculos.add(new Car());
        vehiculos.add(new Bike());
        vehiculos.add(new Truck());

        for (Vehicle vehicle : vehiculos) {
            vehicle.start();
        }
        //*************************************
        //Ejercicio 6
        sendNotification(new EmailNotification());
        sendNotification(new SMSNotification());
        //*************************************
        */
        //Ejercicio 7
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal horse = new Horse();

        showAnimalType(dog);
        showAnimalType(cat);
        showAnimalType(horse);
        //*************************************
        //Ejercicio 8
        Converter c = new Converter();

        System.out.println(c.convert(10));
        System.out.println(c.convert(3.14));
        System.out.println(c.convert("hola"));

        //*************************************
        //Ejercicio 9
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Book(6000));
        products.add(new Electronic(6000));

        for (Product p : products) {
            System.out.println("Precio final: " + p.getPrice());
        }

        //*************************************
        //Ejercicio 10
        Character[] characters = {
                new Warrior(),
                new Archer(),
                new Mage()
        };

        for (Character caracter : characters) {
            System.out.println(caracter.attack());
        }
        //*************************************
    }


// 1. Crea una clase Animal con el método makeSound().
//  Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes.
//   Llama al método desde una lista de Animal.

    public static class Animal {
        public void makeSound() {
            System.out.println("El animal hace un sonido");
        }

        public String getType() {//Se parece a un getter, pero no es un getter clásico.Un getter verdadero sirve para devolver el valor de un atributo,
            return "Animal";//No está devolviendo un atributo, sino un comportamiento que cada clase define a su manera.
        }//Se llama con formato de getter por convención, pero conceptualmente es: Un método sobrescrito que describe el tipo del objeto.
    }

    public static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Guau Guau");
        }

        @Override
        public String getType() {
            return "Perro";
        }
    }

    public static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Miau Miau");
        }

        @Override
        public String getType() {
            return "Gato";
        }
    }

    public static class Cow extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Muu Muu");
        }
    }

    public static class Horse extends Animal {
        @Override
        public String getType() {
            return "Caballo";
        }
    }

    // dentro de la clase PolimorfismoEjercicios, pero FUERA del main
    public static void showAnimalType(Animal animal) {
        System.out.println("Tipo: " + animal.getType());
    }


// 2. Crea una clase Shape con el método calculateArea().
// Luego implementa subclases Circle y Rectangle con sus propias fórmulas.
// Usa una lista de Shape para recorrer e imprimir el área de varias figuras.


    // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes
// tipos de parámetros (String, int, double). Llama a cada uno desde main.
    public static class Printer {

        public void print(String texto) {
            System.out.println("Imprimiendo texto: " + texto);
        }

        public void print(int numero) {
            System.out.println("Imprimiendo entero: " + numero);
        }

        public void print(double decimal) {
            System.out.println("Imprimiendo decimal: " + decimal);
        }
    }

// 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”,
// y otro que reciba un nombre y salude con “Hello, [nombre]”.

    public static class Greeter {

        public void greet() {
            System.out.println("Hello");
        }

        public void greet(String name) {
            System.out.println("Hello " + name);
        }
    }

    // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck que sobrescriban ese método.
//  Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
    public static class Vehicle {
        public void start() {
            System.out.println("El vehiculo esta arrancando.....");
        }
    }

    public static class Car extends Vehicle {
        @Override
        public void start() {
            System.out.println("El auto arranca con llave");
        }
    }

    public static class Bike extends Vehicle {
        @Override
        public void start() {
            System.out.println("La bicicleta comienza a pedalear");
        }
    }

    public static class Truck extends Vehicle {
        @Override
        public void start() {
            System.out.println("El camion arranca con motor pesado ");
        }
    }
// 6. Crea una clase Notification con método send(), y subclases EmailNotification, SMSNotification.
//  Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.

    public static class Notification {
        public void send() {
            System.out.println("Enviando Notificacion .....");
        }
    }

    public static class EmailNotification extends Notification {
        @Override
        public void send() {
            System.out.println("Enviando Email Notification.....");
        }
    }

    public static class SMSNotification extends Notification {
        @Override
        public void send() {
            System.out.println("Enviando SMS Notification... ");
        }
    }

    public static void sendNotification(Notification n) {
        n.send();   // se ejecuta el send() real del objeto
    }
// 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal.
// Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.


// 8. Crea una clase Converter con métodos convert(int), convert(double), y convert(String)
// que devuelvan diferentes formatos de texto.

    public static class Converter {

        public String convert(int n) {
            return "Número entero: " + n;
        }

        public String convert(double d) {
            return "Número decimal: " + d;
        }

        public String convert(String s) {
            return "Texto: " + s.toUpperCase();
        }
    }


    // 9. Crea una clase Product con el método getPrice().
//  Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento.
//  Recorre una lista de Product e imprime el precio final de cada uno.
    public static class Product {
        protected double price;

        //constructor con atributo price
        public Product(double price) {
            this.price = price;
        }

        //Getters
        public double getPrice() {
            return price;
        }
    }

    //Subclase
    public static class Book extends Product {

        public Book(double price) {
            super(price);
        }

        //sobreescribir el metodo
        @Override
        public double getPrice() {
            return price * 0.9; // 10% de descuento
        }
    }

    //Subclase
    public static class Electronic extends Product {

        public Electronic(double price) {
            super(price);
        }

        //sobreescribir metodo
        @Override
        public double getPrice() {
            return price * 0.8; // 20% de descuento
        }
    }


    // 10. Crea una clase Character con método attack().
//  Luego crea subclases Warrior, Archer, Mage con ataques diferentes.
//  En main, crea un array de Character y llama a attack() para cada uno.
    public static class Character {
        public String attack() {
            return "Ataque genérico";
        }
    }

    public static class Warrior extends Character {
        @Override
        public String attack() {
            return "El guerrero ataca con espada";
        }
    }

    public static class Archer extends Character {
        @Override
        public String attack() {
            return "El arquero dispara una flecha";
        }
    }

    public static class Mage extends Character {
        @Override
        public String attack() {
            return "El mago lanza un hechizo";
        }
    }


}
