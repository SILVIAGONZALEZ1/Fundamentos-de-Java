package c08_oop;

public class Polimorfismo {
    static void main(String[] args) {
        //Polimorfismo
//1. Polimorfismo por herencia (sobreescritura)
        var animal = new Animal();
        animal.sound();

        var dog = new Dog();
        dog.sound();


    //2. Polimorfismo por sobrecarga (sobrecarga de metodo)
    var calculadora = new Calculator();
        System.out.println(calculadora.sum(5,8));
        System.out.println(calculadora.sum(5.6 , 15.95));
        System.out.println(calculadora.sum(9,6,99));
}

    public static class Animal {
        public void sound() {
            System.out.println("Algun sonido");
        }
    }

    public static class Dog extends Animal {
        @Override
        public void sound() {
            //super.sound();
            System.out.println("Guau Guau");
        }
    }

    //2. Polimorfismo por sobrecarga (sobrecarga de metodo)
    public static class Calculator {

        public int sum(int a, int b) {
            return a + b;
        }

        public int sum(int a, int b, int c) {
            return a + b + c;
        }

        public double sum(double a, double b) {
            return a + b;
        }
    }

}
