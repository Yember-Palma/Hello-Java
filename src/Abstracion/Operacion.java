package Abstracion;

public class Operacion {
    static void main() {

        var sumas = new Sumas();
        sumas.operador();
        sumas.suma(5,8);
        sumas.descuento();

        var restas = new Restas();
        restas.operador();
        System.out.println(restas.resta(8,5));

        var multiplicar = new Multiplicar();
        multiplicar.operador();
        System.out.println(multiplicar.multiplicacion(2,2));

        var dividir = new Dividir();
        dividir.operador();
        System.out.println(dividir.division(6,2));

    }
    public static abstract class Operaciones {

        public abstract void operador();

        public void suma(int num1, int num2) {
            int sum = num1 + num2;
            System.out.println(sum);

        }

        public double resta(int num1, int num2) {
            return num1 - num2;
        }
        public double multiplicacion(int num1, int num2) {
            return num1 * num2;
        }
        public double division(int num1, int num2) {
            return num1 / num2;
        }

    }
    public interface Descuento {
        void descuento();

    }
    public static class Sumas extends Operaciones implements Descuento {
        @Override
        public void operador() {
            System.out.println("SUMA");

        }
        @Override
        public void descuento() {
            System.out.println("Tiene un descuento del 10%");


        }

        }
    public static class Restas extends Operaciones {
        @Override
        public void operador() {
            System.out.println("Resta");
        }
    }
    public static class Multiplicar extends Operaciones {
        @Override
        public void operador() {
            System.out.println("Multiplicacion");
        }
    }
    public static class Dividir extends Operaciones {
        @Override
        public void operador() {
            System.out.println("Division");
        }
    }
}
