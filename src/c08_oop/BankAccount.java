package c08_oop;

public class BankAccount {
    // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
    // Atributo
    private double balance;//usa decimales

    // Constructor (opcional, para iniciar el saldo)
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Método deposit
    public void deposit(double cantidad) {
        if (cantidad > 0) {
            balance += cantidad;
        }
    }

    // Método para consultar el saldo
    public double getBalance() {
        return balance;
    }
}





