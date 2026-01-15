package c08_oop;

public class Car {
    // 4. Crea una clase Car con atributos marca y modelo y un método showData().
    // 10. Crea una clase Car con el atributo privado speed.
// Agrega los métodos acelerar(int cantidad) que aumente la velocidad (máximo 120) y frenar(int cantidad)
// que reduzca la velocidad (mínimo 0).
//    //Atributos
//    String marca;
//    String modelo;
    private int speed;

//    //Constructor vacio
//    public Car(String marca, String modelo){
//        this.marca= marca;
//        this.modelo=modelo;
//    }
//    //Metodo
//    public void showData(){
//        System.out.println("la marca es " + this.marca + " y su modelo es " + this.modelo);
//    }
//Constructor

    public Car() {
        this.speed = 0; // inicia en 0
    }

    //Setter y Getter
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    //Metodo acelerar
    public void acelerar(int cantidad) {
        if (cantidad > 0){
            speed += cantidad;
            if (speed > 120){
                speed = 120;
            }
        }
    }

    //Metodo para frenar
    public void frenar(int cantidad){
        if (cantidad > 0){
            speed -= cantidad;
            if (speed < 0){
                speed = 0;
            }

        }
    }
}
