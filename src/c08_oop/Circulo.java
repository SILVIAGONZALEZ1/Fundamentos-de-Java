package c08_oop;

public class Circulo extends Shape {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radio * radio;
    }
}

