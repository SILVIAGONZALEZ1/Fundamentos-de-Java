package c08_oop;

public class Rectangulo extends Shape {
    // 7. Crea una clase Rectangulo con métodos para calcular el área y el perímetro.
    // 8. Crea una clase Rectangulo con los atributos privados base y altura.
    // Agrega setters y el método calculateArea() que devuelva el resultado de base * altura.

    //Atributos
    private double base;
    private double altura;

    //Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    //Getters y Setters
//    public int getAltura() {
//        return altura;
//    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

//    public int getBase() {
//        return base;
//    }

    public void setBase(double base) {
        this.base = base;
    }

    //METODOS
    //Metodo para calcular el área
    public void area() {
        System.out.println("el area es = " + (this.base * this.altura));
    }

    //Metodo para calcular el perímetro
    public void perimetro() {
        System.out.println("el perimetro es = " + (2 * (this.base + this.altura)));
    }

    //Metodo calculateArea
    // public void calculateArea(){
//        System.out.println("el calculateArea es: " + (this.base * this.altura));
//    }

    @Override
    public double calculateArea() {
        return base * altura;
    }
}
