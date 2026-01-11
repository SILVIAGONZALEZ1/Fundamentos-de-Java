package c07_funciones;

import java.util.ArrayList;
import java.util.Arrays;

public class Funciones {
    public static void main(String[] args) {//funcion de tipo publica es un MODIFICADOR de acceso, estatica, void=no retorna nada.
        //main es el nombre de la funcion
        //lo que esta dentro del parentesis(String[] args) son los parametros
        //String[] es un Array y es de tipo String y su nombre es args
        for (int i = 0; i < 5; i++) {
            //System.out.println("Hola, Java!");
            sendEmail(); //se reutiliza la funcion
        }

        //System.out.println("Hola, Javalallala!");
        sendEmail(); //se reutiliza la funcion, aca va sin parametros
        sendEmailToUser("silvia@gmail.com");//aca con 1 parametro de tipo String
        sendEmailToUser("silvia@gmail.com", "sil"); //sobrecarga, aca con 2 parametros de tipo String, o le puedo agregar varios mas


        //se crea users que sera un ArrayList de emails
        var users = new ArrayList<>(Arrays.asList("pedro@gmail.com", "juan@gmail.com", "luis@gmail.com", "mireia@gmail.com"));//aca agrego los String que componen la lista del ArrayLis
        sendEmailToUser(users);//aca se llama la funcion que traera un ArrayList con lista de emails

        //se invoca la funcion con estado true o false
        //sendEmailWithState();
        var state = sendEmailWithState("perlita@gmail.com");
        System.out.println(state); //aqui invoco la variable

        System.out.println(sendEmailWithState(""));//
    }

    //Creamos una funcion sendEmail
    //Funciones sin parametros ni retorno
    public static void sendEmail() { //debo agregar static para que funcione sendEmail porque esta dentro de una funcion estatica al inicio
        System.out.println("Se envia el email" + "Funcion sin parametros ni retorno");
    }


    //Funciones con parametro
    public static void sendEmailToUser(String email) {//aca con 1 parametro de tipo String
        System.out.println("Se envia el email a " + email);
    }


    //Reutilizo la funcion con 2 parametros osea la sobrecargo
    public static void sendEmailToUser(String email, String name) {//sobrecarga, aca con 2 parametros de tipo String, o le puedo agregar varios mas

        System.out.println("Se envia el email a " + name + " (" + email + ")");
    }


    //Reutilizo la funcion y sobrecargo con una lista de ArrayList
    public static void sendEmailToUser(ArrayList<String> emails) {//sobrecarga, aca con ArraysList como parametro de tipo String emails

        for (String email : emails) {
            System.out.println("se envia un ArrayList de emails " + email);
        }
    }

    //Funcion con retorno y parametros, la funcion, sobrecargo y return

    public static boolean sendEmailWithState(String email) {
        if (email.isEmpty()) {
            return false;
        }
        System.out.println("Se envia el email with state a: " + email);
        return true;
    }
}//se puede utilizar una funcion dentro de otra funcion

