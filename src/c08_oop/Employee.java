package c08_oop;

public class Employee {
    //7.  Crea una clase Employee con el atributo privado salary.
    // Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.//raiseSalary = aumentarSalario

    //Atributos
    private double salary;

    //Constructor
    public Employee(double salary) {
        this.salary = salary;
    }
    //Getters
    public double getSalary() {
        return salary;
    }

    //Metodo para aumentarSalario
    public void raiseSalary(double percent){
        if (percent > 0) {
            salary += salary * (percent / 100);
        } else {
            System.out.println("El porcentaje de aumento debe ser positivo.");
        }
    }

//    Qué se trabaja en este ejercicio
//
//    Atributo private → encapsulación
//
//    Validación en el método (percent > 0)
//
//    Cálculo de porcentaje
//
//    Uso de métodos para modificar el estado del objeto



}
