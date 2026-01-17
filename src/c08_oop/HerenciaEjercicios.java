package c08_oop;

import java.util.ArrayList;

import c08_oop.Herencia.Animal.*;
import c08_oop.Herencia.Dog;
import c08_oop.Herencia.Cat;
import c08_oop.Herencia.Pajaro;

public class HerenciaEjercicios {
    public static void main(String[] args) {
/*
        // 1. Crea una clase Vehicle con un método move().
        //  Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
        var auto = new Vehicle();
        auto.move();
        var carcito = new Car();
        carcito.honk();

        // 2. Define una clase Person con los atributos name y age.
        //Luego crea una clase Student que agregue el atributo grade y un metodo study().
        //las clases ya las tenia creadas de ejercicios anteriores, se modificaron se instancio aqui
       //Ejercicio 2
        Student alumno = new Student("Juan", 16, 4);
        alumno.study();

        // 3. Crea una clase Animal con el método makeSound().
        //  Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
        //Ejercicio 3
        //Se llamo en la Class Herencia que es la Main

        // 4. La clase Employee tiene los atributos name y salary.
        // Manager hereda de Employee y agrega el atributo department.
        //Ejercicio 4
        var gerente = new Manager(1500.50, "Silvia", "IA");
        System.out.println("El salario es de $ " + gerente.getSalary() + " la  manager se llama " + gerente.getName() + " y trabaja en el departamento de :" + gerente.department);


        //Ejercicio 5
        // 5. Crea una clase abstracta Shape (forma) con un método calculateArea().
        //  Luego implementa ese método en Circulo y Rectangulo
        var circulo = new Circulo(5);
        var rectangulo = new Rectangulo(4, 3);

        System.out.println("Área del círculo: " + circulo.calculateArea());
        System.out.println("Área del rectángulo: " + rectangulo.calculateArea());


// 6. Crea una clase Pajaro con el método fly().
//  Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
        var aguila = new Eagle("Águila Real");
        aguila.fly();


        //Ejercicio 7
        Phone p = new Phone();

        //Ejercicio 8
        SavingsAccount cuenta = new SavingsAccount(1000);
        cuenta.deposit(500);
        cuenta.retirar(200);
        cuenta.addInterest(10);

        System.out.println("Saldo final: " + cuenta.getSaldo());

        //Ejercicio 9
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new Truck();

        v1.describe();
        v2.describe();
        v3.describe();
*/
//Ejercicio 10
        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().


        ArrayList<Herencia.Animal> animales = new ArrayList<>();

        animales.add(new Dog("Goldy", 10));
        animales.add(new Cat("Michi"));
        animales.add(new Pajaro("Catita"));

        for (Herencia.Animal a : animales) {
            a.makeSound(); // polimorfismo
        }
    }



//Ejercicio 1

    //Clase padre Vehicle
    public static class Vehicle {
        //Metodo move
        public void move() {
            System.out.println("el vehiculo se esta moviendo");
        }

        public void describe() {
            System.out.println("Este es un vehículo");
        }
    }

    //Subclase Car
    public static class Car extends Vehicle {
        //Metodo honk
        public void honk() { // honk = bocinazo
            System.out.println("el auto toca un bocinazo ");
        }

        //Metodo describe()
        @Override
        public void describe() {
            System.out.println("El auto tiene 4 ruedas");
        }
    }

    //Ejercicio 4
//Subclase
    public static class Manager extends Employee {
        //Atributo
        private String department;

        //Constructor
        public Manager(double salary, String name, String department) {
            super(salary, name);
            this.department = department;
        }


        // 5. Crea una clase abstracta Shape (forma) con un método calculateArea().
        //  Luego implementa ese método en Circulo y Rectangulo


    }

    // 7. Haz una clase Device con un constructor que imprima “Device created”.
// Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
    public static class Device {
        public Device() {
            System.out.println("Device created");
        }
    }

    public static class Phone extends Device {
        //@Override  IMPORTANTE El @Override solo sirve para métodos, no para constructores.
        public Phone() {
            super();
            System.out.println("Phone ready");
        }
    }

// 8. Account tiene un saldo y métodos para deposit() y (withdraw() =retirar)
// (SavingsAccount=CuentaDeAhorros) hereda y agrega un método (addInterest()=agregar interes)


    public static class Account {
        //Atributo
        private double saldo;

        //Constructor
        public Account(double saldo) {
            this.saldo = saldo;
        }
//        Primero definimos qué deben recibir los métodos:
//        deposit(double monto)
//        retirar(double monto)
//        addInterest(double porcentaje)

        //Metodos depositar dinero
        public void deposit(double monto) {
            if (monto > 0) {
                saldo += monto;
            }
        }

        //Metodo retirar
        public void retirar(double monto) {
            if (monto > 0 && monto <= saldo) {
                saldo -= monto;
            }
        }
        //Getter para ver el saldo

        public double getSaldo() {
            return saldo;
        }
    }

    public static class SavingsAccount extends Account {

        public SavingsAccount(double saldo) {
            super(saldo);
        }

        //Metodo agregar interes
        public void addInterest(double porcentaje) {
            double interes = getSaldo() * (porcentaje / 100);
            deposit(interes);
        }
    }

// 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.
//La clase Vehicle esta creada mas arriba

    //Subclase Bike
    public static class Bike extends Vehicle {
        //Metodo describe
        @Override
        public void describe() {
            System.out.println("la bicicleta tiene 2 ruedas ");
        }
    }

    //Subclase Truck
    public static class Truck extends Vehicle {
        //Metodo describe
        @Override
        public void describe() {
            System.out.println("El camion tiene 8 ruedas ");
        }
    }
}












