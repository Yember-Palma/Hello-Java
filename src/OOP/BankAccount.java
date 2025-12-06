package OOP;

import java.time.Duration;

public class BankAccount {
    //Atributos
    private String accountNumber;
    private double balance;

    //constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void saldo() {
        System.out.println("Su saldo antes del retiro: " + balance);
    }
    //metodo
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("usd deposito: " + amount + " su saldo es: " + balance);
        } else {
            System.out.println("ingrese un saldo mayor a cero");
        }
    }
    public void retiro(double retir) {
        if (balance>0) {
            balance -= retir;
            System.out.println("usd retiro: " + retir + " su saldo es: " + balance);
        }else {
            System.out.println("saldo insuficiente");
        }
    }
}
