package Herencia;

public class AccountHeren4 {
    static void main() {

        //ejercicio 8 herencia
        //Account tiene una saldo y metodos para deposit() y withdraw().
        //SavingsAccount hereda y agrega un metodo addInterest().
        AccountHeren account = new AccountHeren(15);
        account.deposit2(200);
        account.whithdraw(151);
        System.out.println("Saldo de cuenta: " + account.balance);

        SavingsAccount interes = new SavingsAccount(300);
        interes.deposit2(100);
        interes.addInterest();
        System.out.println("Saldo de cuenta de ahorros: " + interes.balance);




    }

    public static class AccountHeren {
        protected double balance;

        public AccountHeren(double balance) {
            this.balance = balance;

        }

        public void deposit2(double amount) {
            balance += amount;
            System.out.println("Deposito de: " + amount + " Nuevo saldo: " + balance);
        }

        public void whithdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Retiro de: " + amount + " Nuevo saldo: " + balance);
            } else {
                System.out.println("Saldo insuficiente");
            }

        }
    }
    public static class SavingsAccount extends AccountHeren {
        public SavingsAccount(double balance) {
            super(balance);
        }
        public void addInterest() {
            double interest = balance * 0.05;
            balance += interest;
            System.out.println("Interes agregado: " + interest + " Nuevo saldo: " + balance);
        }
    }
}