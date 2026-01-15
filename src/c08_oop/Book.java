package c08_oop;

public class Book {
    // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
    // 4. Crea una clase Book con el atributo privado title.
    // Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()).
    //  El título debe asignarse solo por el constructor.

    //Atributos
    private String title;
    private String author;

    //Constructor: asigna el titulo al crear el objeto
    public Book(String title, String author){
        this.title = title;
        this.author= author;
    }

    //Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor(){
        return author;
    }
    //No hay setter, por lo tanto no se puede modificar

    //Metodo
    public void mostrarDatos(){
        System.out.println("Asi se llama el libro " + "("+ this.title +")" + " y este es su autor " + "("+ this.author  +")");
    }
}
//    Concepto que se practica
//
//    private → el atributo está encapsulado.
//
//    Constructor → única forma de asignar el valor.
//
//    getTitle() → solo lectura.
//
//    Sin setTitle() → objeto inmutable en ese campo.
//
//    Es un ejemplo perfecto de encapsulación y control de acceso.
