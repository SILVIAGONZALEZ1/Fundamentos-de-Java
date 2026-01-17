package c08_oop;

public class Herencia {
    public static void main(String[] args) {
        //Herencia
        var animal = new Animal("Mi animal");
        //animal.name = "Mi animal";
        //animal.eat();

        var dog = new Dog("Goldy", 5);
        //dog.name = "Goldy";
        //dog.eat();
        dog.makeSound();

        var cat = new Cat("Michi");
        //cat.name = "Michi";
        //cat.eat();
        cat.makeSound();

//        var pajaro = new Pajaro("Catita");
//        //pajaro.name = "Catita";
//        pajaro.eat();
//        pajaro.fly();


    }

    //Clase padre
    public static class Animal {
        //Atributos
        String name;

        //Constructor
        public Animal(String name) {
            this.name = name;
        }

        //Metodo eat
        public void eat() {
            System.out.println("El animal con nombre " + name + " esta comiendo");
        }

        //método makeSound()
        public void makeSound() {
            System.out.println(" el animal xxx hace .....");
        }
    }

    //Subclase o clase hija
    public static class Dog extends Animal {
        int age;

        public Dog(String name, int age) {
            super(name);
            this.age = age;

        }

        @Override //sobreescribe metodos
        public void eat() {
            // super.eat();
            System.out.println("El perro con nombre " + name + " esta comiendo");
        }


        @Override //sobreescribe metodo de Animal
        public void makeSound() {
            // super.eat();
            System.out.println("El animal con nombre " + name + " hace este sonido Woof Woof");
        }

    }

    //Subclase o clase hija
    public static class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }

        @Override //sobreescribe metodo de Animal
        public void makeSound() {
            // super.eat();
            System.out.println("El animal con nombre " + name + " hace este sonido Meou Meou");
        }

    }

    //Subclase o clase hija
    public static class Pajaro extends Animal {

        public Pajaro(String name) {
            super(name);
        }

        public void fly() {
            System.out.println("El pajaro esta volando");
        }
        @Override //sobreescribe metodo de Animal
        public void makeSound() {
            System.out.println("El animal con nombre " + name + " hace este sonido Pio Pio");
        }

    }

    // Clase Eagle (subclase de Pajaro)
    public static class Eagle extends Pajaro {

        public Eagle(String name) {
            super(name); // llama al constructor de Pajaro
        }

        @Override
        public void fly() {
            super.fly(); // método del padre
            System.out.println("El águila vuela a gran altura");
        }
    }

}

