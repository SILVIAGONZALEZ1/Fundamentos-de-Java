package c08_oop;

public class BankAccount {
    // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.

    // 3. Crea una clase BankAccount con el atributo privado balance.
    // Implementa los métodos deposit(double cantidad)
    // y retirar(double cantidad) que validen las cantidades correctamente.

    // Atributo
    private double balance;//usa decimales

    // Constructor (opcional, para iniciar el saldo)
    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    //Getters
    // Método para consultar el saldo
    public double getBalance() {
        return balance;
    }


    // Método deposit
    public void deposit(double cantidad) {
        if (cantidad > 0) {
            balance += cantidad;
            System.out.println("Depósito exitoso: $" + cantidad + ". Saldo actual: $" + balance);
        } else {
            System.out.println("Error: La cantidad debe ser mayor a 0");
        }
    }


    //Método para retirar
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= balance) {
            balance -= cantidad;
            System.out.println("Retiro exitoso: $" + cantidad + ". Saldo actual: $" + balance);
        } else if (cantidad > balance) {
            System.out.println("Error: Saldo insuficiente");
        } else {
            System.out.println("Error: La cantidad debe ser mayor a 0");
        }
    }
}




