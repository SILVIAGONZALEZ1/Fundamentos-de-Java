package c08_oop;

public class Composicion {
    static void main(String[] args) {
        //Composicion ("tiene un") // un coche tiene un motor
        var car = new Car();
       //car.engine.on();
        car.on();

        car.off();
    }

    public static class Engine {
        public void on() {
            System.out.println("Motor encendido");
        }
        public void off(){
            System.out.println("El motor esta apagado");
        }
    }

    public static class Car {
        final private Engine engine = new Engine();
        //private final Composicion.Engine engine = new Composicion.Engine();
        public void on(){
            engine.on();
        }

        public void off(){
            engine.off();
        }


    }

}
