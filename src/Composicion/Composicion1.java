package Composicion;

public class Composicion1 {
    static void main() {
        var Ana = new persona();
        Ana.calcularEdad.edad(1996,2025);


    }
    public static class CalcularEdad {
        int fechaDeNacimiento;
        int anoActual;

        public void edad(int fechaDeNacimiento, int anoActual) {
            int total = anoActual - fechaDeNacimiento;
            System.out.println("su edad es: " + total + " años");
        }
    }
    public static class persona {

        CalcularEdad calcularEdad = new CalcularEdad();

    }
}
