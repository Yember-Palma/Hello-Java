package OOP;

public class EmployeEncap {
    private String name;
    private double salary;

    public EmployeEncap(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            double increase = salary * (percent / 100);
            salary += increase;
            System.out.println("sueldo aumentado");
        } else {
            System.out.println("el aumento tiene que ser mayor al sueldo actual");
        }
    }
    public void showInfo() {
        System.out.println("Empleado: " + name + " Salario: " + salary);
    }
}
