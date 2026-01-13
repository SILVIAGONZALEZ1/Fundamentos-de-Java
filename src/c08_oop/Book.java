package c08_oop;

public class Book {
    // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
    //Atributos
    String title;
    String author;

    //Constructor
    public Book(String title, String author){
        this.title = title;
        this.author= author;
    }

    //Metodo
    public void mostrarDatos(){
        System.out.println("Asi se llama el libro " + "("+ this.title +")" + " y este es su autor " + "("+ this.author  +")");
    }
}
