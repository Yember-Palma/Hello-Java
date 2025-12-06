package OOP;

public class Worker {
    //parametros
    String name;
    private double salario;


    //constructor
    public Worker(String name, double salario) {
        this.name = name;
        this.salario = salario;
    }

    //metodo
    public void mostrar() {
        System.out.println("su salario es: " + salario);
    }

}
