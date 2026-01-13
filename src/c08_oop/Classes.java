package c08_oop;

public class Classes {

    static void main(String[] args) {

        var person = new Person("Silvia", 38);//instancia mos a Person

        // person.name = "Silvia"
        // person.age = 38;

        person.sayHello();

        person.name = "Rosa";
        System.out.println(person.name);


        //Creación de otra persona
        var person2 = new Person("Carla", 55);
        person2.sayHello();
    }


}
