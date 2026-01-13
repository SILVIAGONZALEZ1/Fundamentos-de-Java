package c08_oop;

public class Car {
    // 4. Crea una clase Car con atributos marca y modelo y un método showData().
    //Atributos
    String marca;
    String modelo;

    //Constructor vacio
    public Car(String marca, String modelo){
        this.marca= marca;
        this.modelo=modelo;
    }
    //Metodo
    public void showData(){
        System.out.println("la marca es " + this.marca + " y su modelo es " + this.modelo);
    }
}
