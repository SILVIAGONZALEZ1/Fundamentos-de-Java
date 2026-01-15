package c08_oop;

public class Rectangulo {
    // 7. Crea una clase Rectangulo con métodos para calcular el área y el perímetro.
    // 8. Crea una clase Rectangulo con los atributos privados base y altura.
    // Agrega setters y el método calculateArea() que devuelva el resultado de base * altura.

    //Atributos
    private int base;
    private int altura;

    //Constructor
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    //Getters y Setters
//    public int getAltura() {
//        return altura;
//    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

//    public int getBase() {
//        return base;
//    }

    public void setBase(int base) {
        this.base = base;
    }

    //METODOS
    //Metodo para calcular el área
    public void area(){
        System.out.println("el area es = " + (this.base * this.altura));
    }

    //Metodo para calcular el perímetro
    public void perimetro(){
        System.out.println("el perimetro es = " + (2*(this.base + this.altura)));
    }

    //Metodo calculateArea
    public void calculateArea(){
        System.out.println("el calculateArea es: " + (this.base * this.altura));
    }
}
