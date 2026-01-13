package c08_oop;

public class Dog {
    // 2. Crea una clase Dog con un método bark() que imprima su sonido.
    //Atributo
    String sonido;

    //Constructor
    public Dog(String sonido){
        this.sonido=sonido;
    }
    //Metodo
    public void bark(){//ladrar
        System.out.println("el dog ladra asi  : " + sonido);
    }



}
