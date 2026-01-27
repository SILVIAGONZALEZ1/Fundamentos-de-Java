package c09_excepcion;

public class Excepciones {
    static void main(String[] args) {

        System.out.println("********* Manejo de excepciones ***********");
        System.out.println("********* Manejo de excepciones  --->  try catch ************** ");

        try {
            var resultado = 10 / 0;
            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.println("************** Manejo de excepciones ---->  try con multiples catch **************" );
        try {
            var resultado = 10 / 5;
            System.out.println(resultado);

            var name = "Silvia";
            name = null;
            System.out.println("Name: " + name.toUpperCase());

        }catch (ArithmeticException e){
            System.out.println("No se puede dividir entre 0 " + e);
        }catch(NullPointerException e){
            System.out.println(" se a producido un null pointer ");
        }catch(Exception e){
            System.out.println("se a producido un error no esperado");
        }



        System.out.println("*********** Manejo de excepciones ---->  try catch finally ******************");
        //finally
        try {
            var resultado = 10/ 0 ;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        }finally {
            System.out.println("Fin del bloque try-catch");
        }

        System.out.println("************ Manejo de excepciones  ----->   Lanzamiento y captura de excepciones del sistema  ----> throw *********** ");
        //throw
        var throwExample = new ThrowExample();
        try{
            throwExample.checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error revisando la edad: " + e.getMessage());
        }



        //Excepcion personalizada
        try {
            throwExample.checkScore(450);
        } catch (CustomExcepcion e) {
            System.out.println("Error revisando la puntuacion: " + e.getMessage());
        }









        System.out.println("******** Fin ******************");
    }






}
