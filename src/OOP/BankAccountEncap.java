package OOP;

public class BankAccountEncap {
    //atributo
    private double accountNumber;
    private double balance;

    //constructor
    public BankAccountEncap(double accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.deposit(balance);

    }

    //metodo
    public void deposit(double amount) {
        if (amount > 0) {
            balance +=amount;
            System.out.println("deposito correcto");
            System.out.println("su saldo es: " + balance);
        } else {
            System.out.println("no se puede realizar el deposito el valor es: " +amount );
        }
    }
    public void withdraw(double amount) {
        if (amount <= balance && amount!=0) {
            balance -= amount;
            System.out.println("retiro con exito");
            System.out.println("su saldo es: " + balance);
        } else if (amount ==0) {
            System.out.println("a ingreado cero");

        } else {
            System.out.println("saldo insuficiente");
        }
    }
}
