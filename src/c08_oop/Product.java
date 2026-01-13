package c08_oop;

public class Product {
    // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.

    //Atributos
    int precio;

    //Constructor
    public Product(int precio){
        this.precio = precio;
    }

    //Metodo
    public void descuento(){
        System.out.println("el precio inicial es $ " + this.precio + " con el descuento del 10% tenes que pagar: $ " + (precio * 0.90));
    }


}
