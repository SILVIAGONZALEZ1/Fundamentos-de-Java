package c08_oop;

public class Product {
    // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.

    // 2. Crea una clase Product con el atributo privado price.
    // Añade el método setPrice(double price) que solo permita precios mayores a 0.

    //Atributos
    private double precio;

    //Constructor
    public Product(int precio) {
        this.precio = precio;
    }

    //Getter
    public double getPrecio() {
        return precio;
    }

    //Setter
    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("precio negativo no valido");
        }
    }

    //Metodo
    public void descuento() {
        System.out.println("el precio inicial es $ " + this.precio + " con el descuento del 10% tenes que pagar: $ " + (precio * 0.90));
    }


}
