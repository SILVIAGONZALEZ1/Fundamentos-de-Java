package c08_oop;

public class Abstraccion {
    static void main(String[] args) {
        //Abstraccion tipos:
        //1- Clase abstracta
       // var animal = new Animal();// no se puede instanciar la clase Padre por que es abstracta
       // animal.sleep();

        var dog = new Dog();
        dog.sleep();
        dog.sound();

        var cat =  new Cat();
        cat.sleep();
        cat.sound();



        //2-Interface

        var pajaro = new Bird();
        pajaro.fly();
        pajaro.fly2();

        var bat = new Bat();
        bat.fly();


    }//***********************************


    //1- Clase abstracta
    //Clase Padre
    public static abstract class Animal {

        public abstract void sound(); //le quito la implementacion


        public void sleep(){
            System.out.println("El animal esta durmiendo");
        }
    }
//Sub Clase
    public static class Dog extends Animal{

        @Override
        public void sound(){
            System.out.println("Guau");
        }


        @Override
        public void sleep(){
            System.out.println("el perro esta durmiendo");
        }

    }
//Sub Clase
    public static class Cat extends Animal{

    @Override
    public void sound(){
        System.out.println("Miau");
    }
    }



    //2- Interface
    public interface Flying {

        void fly();
    }

    public interface Flying2 {

        void fly2();
    }

    //Sub Clase
    public static class Bird extends Animal implements Flying, Flying2{

        @Override
        public void sound(){
            System.out.println("Miau Miau");
        }
        @Override
        public void fly(){
            System.out.println("el pajaro vuela ");
        }

        @Override
        public void fly2() {
            System.out.println("el pajaro vuela por 2 vez");
        }
    }
    //Sub Clase
    public static class Bat extends Animal implements Flying{

        @Override
        public void sound(){
            System.out.println("Bat bat");
        }
        @Override
        public void fly(){
            System.out.println("el bat vuela ");
        }
    }



}
