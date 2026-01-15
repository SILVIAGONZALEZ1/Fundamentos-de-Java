package c08_oop;

public class ModificadoresAccesosEjercicios {
    static void main(String[] args) {

     /*
• Encapsulamiento: Consiste en proteger los datos de una clase para controlar su acceso desde el exterior. Esto se logra mediante modificadores de acceso:
    ◦ public: Acceso desde cualquier parte.
    ◦ private: Acceso solo dentro de la misma clase.
    ◦ protected: Acceso dentro del mismo paquete y por subclases.
    ◦ default: Acceso solo dentro del mismo paquete.
    ◦ Para interactuar con datos privados de forma segura, se emplean Getters (obtener) y Setters (establecer/validar)

*/
 /*       // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge()
        // para asignar y mostrar valores desde otra clase.
        var person = new Person("Silvia", 38, "24123456A");//instancia mos a Person
        person.sayHello();

        person.setName("Josefina");
        System.out.println("El nombre es: " + person.getName());

        person.setAge(30);
        System.out.println("La edad es: " + person.getAge());

        person.setId("89000789");
        System.out.println(" el id es: " + person.getId());

        person.sayHello();

        // 2. Crea una clase Product con el atributo privado price.
        // Añade el método setPrice(double price) que solo permita precios mayores a 0.
        var producto = new Product(1000);
        System.out.println("precio original: $" + producto.getPrecio());

        producto.setPrecio(4000);
        System.out.println("precio luego del setPrecio: $" + producto.getPrecio());

        // 3. Crea una clase BankAccount con el atributo privado balance.
        // Implementa los métodos deposit(double cantidad) y retirar(double cantidad)
        // que validen las cantidades correctamente.

        var cuenta = new BankAccount(5000);
        System.out.println("Saldo inicial: $" + cuenta.getBalance());

        cuenta.deposit(1500);
        cuenta.retirar(2000);
        cuenta.retirar(10000);

        // 4. Crea una clase Book con el atributo privado title.
        // Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()).
        //  El título debe asignarse solo por el constructor.
        var book = new Book("El corazon de la piedra", "Jose Maria Garcia Lopez");
        // solo se puede leer
        System.out.println("Titulo del libro: " + book.getTitle() + " y el autor es:  " + book.getAuthor());

// 5. Crea una clase Temperature con el atributo privado celsius.
// El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.

        var temperatura = new Temperature();
        temperatura.setCelsius(25); //valido
        System.out.println(temperatura.getCelsius());
        temperatura.setCelsius(-150);  //invalido, no se asigna
//        Qué se ve en este ejercicio
//
//        private → encapsulación del atributo.
//        setCelsius() → controla qué valores se permiten.
//        Validación con if.
//        Mensaje de error si el valor está fuera del rango.
//        Así se cumple que solo se acepten valores entre -100 y 100.


// 6. Crea una clase User con los atributos privados username y password.
// Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword)
// que compare contraseñas.
        var usuario = new User();
        usuario.setPassword("silvia");
        usuario.setPassword("12345");
        if (usuario.checkPassword("1234")) {
            System.out.println("Contraseña correcta");
        } else {
            System.out.println("Contraseña incorrecta");
        }
/Qué se practica acá
//Encapsulación (private)
//Uso de setters
//Comparación de String con equals()
//Método que devuelve true o false según coincidan las contraseñas


// 7. Crea una clase Employee con el atributo privado salary.
// Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.

        var empleado = new Employee(1500000);
        empleado.raiseSalary(15);//aumento valido
        System.out.println("Nuevo salario: $ " + empleado.getSalary());
        empleado.raiseSalary(-5);//aumento invalido

// 8. Crea una clase Rectangulo con los atributos privados base y altura.
// Agrega setters y el método calculateArea() que devuelva el resultado de base * altura.
        var rectangulo = new Rectangulo(5, 3);
        rectangulo.calculateArea();

// 9. Crea una clase Student con el atributo privado grade.
// Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
        var estudiante = new Student(89);
        estudiante.isPassed();
        System.out.println(estudiante.isPassed());
*/

        // 10. Crea una clase Car con el atributo privado speed.
// Agrega los métodos acelerar(int cantidad) que aumente la velocidad (máximo 120) y frenar(int cantidad)
// que reduzca la velocidad (mínimo 0).
        var auto = new Car();

        auto.acelerar(50);
        System.out.println("Velocidad: " + auto.getSpeed()); // 50

        auto.acelerar(150);
        System.out.println("Velocidad: " + auto.getSpeed()); // 120 (máximo)

        auto.frenar(30);
        System.out.println("Velocidad: " + auto.getSpeed()); // 90

        auto.frenar(200);
        System.out.println("Velocidad: " + auto.getSpeed()); // 0 (mínimo)
    }


}
