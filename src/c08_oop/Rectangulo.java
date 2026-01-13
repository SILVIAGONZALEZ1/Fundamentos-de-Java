package c08_oop;

public class Rectangulo {
    // 7. Crea una clase Rectangulo con métodos para calcular el área y el perímetro.
    //Atributos
    int base;
    int altura;

    //Constructor
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
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

}
