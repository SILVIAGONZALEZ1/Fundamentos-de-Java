package c09_excepcion;

public class ThrowExample {

    //Lanzamiento de errores del sistema

//    static void main(String[] args) {
//        var age = 15;
//        if (age < 15){
//            throw new IllegalArgumentException("Tienes que ser mayor de edad ");
//        }
//    }




    public void checkAge(int age) throws IllegalArgumentException{

        if (age < 18) {
            throw new IllegalArgumentException("Tienes que ser mayor de edad ");
        } else {
            System.out.println("Es mayor de edad");
        }
    }
    public void checkScore(int score) throws CustomExcepcion {
        if (score < 0 || score > 100) {
            throw new CustomExcepcion("La puntuacion debe estar entre 0 y 100");
        }else {
            System.out.println("Puntuacion validad: " + score);
        }
    }

}
