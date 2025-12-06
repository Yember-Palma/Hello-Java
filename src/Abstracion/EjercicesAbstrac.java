package Abstracion;

import java.awt.*;
import java.awt.desktop.AppForegroundListener;
import java.util.ArrayList;
import java.util.Arrays;

public class EjercicesAbstrac {
    static void main() {
        /*1. Crea una clase Abstrac ShapeAbstrac con el metodo calcularArea().
        Luego implementa dos subclases: Circle y Rectangle, y haz que cada una
        calcule su propia area*/

        var circulo = new Circulo();
        System.out.println(circulo.cslcularArea(5));

        var rectangulo = new Rectangulo();
        System.out.println(rectangulo.calcularArea(5, 5));


        /*2. Crea una interfaz ´Playable con el metodo play().
         * Luego implementa esa interfaz en dos clases. Guitar y Piano
         * Cada una debe mostrar un mensaje diferente al ejecutarse*/

        var guitar = new Guitar();
        guitar.play();

        var piano = new Piano();
        piano.play();

        /* 3. Define una clase abstracta AnimalAbstrac con el metodo
        makeSoundAbs(). Implementa Loro y Lobo para que agan sonido
         distintos. Crea un array de AnimalAbstrac para mostrar
         Polimorfismo*/

        ArrayList<AnimalAbstrac> ani = new ArrayList<>(Arrays.asList(new Lora(), new Lobo()));

        for (AnimalAbstrac Animall : ani) {
            Animall.makeSoundAbs();
        }
        //segunda forma
        AnimalAbstrac[] animalles = {new Lora(), new Lobo()};

        for (AnimalAbstrac animals : animalles) {
            animals.makeSoundAbs();
        }

        //4. Crea una interfaz Drawable. Implementa las clases Circle, Square
        // y Triuangle que muestren como se dibuja cada figura usando draw().

        var cuadrado = new Square();
        cuadrado.draw();

        //5. Crea una clase abstracta EmployeAbs con un metodo calculateSalary().
        //implementa FullTimeEmployee y PartTimeEmployee con logica diferente para
        //calcular el salario

        var completo = new FullTimeEmployee("Ana");
        completo.calculateSalary();

        var medio = new PartTimeEmployee("Juan");
        System.out.println("el salario de "+ medio.name + " es " + medio.calculateSalary());

        //6. Crea una interfaz MovableAbs con el metodo  move(). Haz que las
        //clases Car y Robot implementen ese metodo con comportamientos diferentes.

        var robot = new Robot();
        robot.move();
        var carros = new CarAbs();
        carros.move();

        //7. Crea una clase abstracta Appliance con metodo turnOn()
        //y turnOff(). Implementa TV y WashingMachine con mensajes diferentes
        //al encender y apagar

        var tv = new TV();
        tv.turnOn();
        tv.turnOff();

        var lavadora = new WashingMachine();
        lavadora.turnOn();
        lavadora.turnOff();

        //8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck
        // que implemente ambas interfaces y muestre como puede volar y nadar
        var pato = new Duck();
        pato.fly();
        pato.nadar();

        //9. Crea una clase abstracta Document con el metodo print().
        //Luego crea PDFDocument y WordDocument, cada una con su
        //forma de imprimir

        Document pdf = new PDFDocument();
        Document word = new WordDocument();
        pdf.print();
        word.print();

        //10. Crea una interfaz PayableAbs con el metodo pay(). Luego implementa
        //las clases Invoice y EmployeePayment, cada una mostrando un mensaje
        //de pago diferente

        PayableAbs factura = new Invoice(450);
        factura.pay();
        PayableAbs pago = new EmployeePayment("Ana", 1000);
        pago.pay();


    }

    public static abstract class ShapeAbstrac {

        public double calcularArea() {
            return calcularArea();
        }

    }

    public static class Circulo extends ShapeAbstrac {


        public double cslcularArea(double numero1) {
            return Math.PI * (numero1 * numero1);
        }

    }

    public static class Rectangulo extends ShapeAbstrac {

        public double calcularArea(double numero1, double numero2) {
            return numero1 * numero2;
        }


    }
    //Ejercicio dos

    public interface Playable {
        public void play();

    }

    public static class Guitar implements Playable {
        @Override
        public void play() {
            System.out.println("Estoy tocando la guitarra");
        }

    }

    public static class Piano implements Playable {
        @Override
        public void play() {
            System.out.println("Estoy tocando el piano");
        }
    }

    // Ejercicios numero 3

    public static abstract class AnimalAbstrac {
        public abstract void makeSoundAbs();

    }

    public static class Lora extends AnimalAbstrac {
        @Override
        public void makeSoundAbs() {
            System.out.println("El loro hace: GuereGuere");
        }
    }

    public static class Lobo extends AnimalAbstrac {
        @Override
        public void makeSoundAbs() {
            System.out.println("El lobo hace: AUUUUUUUUU AUUUU");
        }

    }

    //ejercicio 4
    public interface Drawable {
        public void draw();
    }

    public static class Circle10 implements Drawable {
        @Override
        public void draw() {
            System.out.println("Dibujando un circulo");

        }
    }

    public static class Square implements Drawable {
        @Override
        public void draw() {
            System.out.println("Dibujando un cuadrado");
        }
    }

    public static class Triangle implements Drawable {
        @Override
        public void draw() {
            System.out.println("Dibujando un triangulo");

        }
    }
    //Ejercicio 5

    public static abstract class EmployeAbs {
        final double salario = 1000.0;

        public EmployeAbs() {
        }
        public abstract double calculateSalary();

    }
    public static class FullTimeEmployee extends EmployeAbs {
        String name;
        public FullTimeEmployee(String name) {
            this.name = name;

        }
        @Override
        public double calculateSalary() {
            System.out.println("el salario de " + name + " es: " + salario);
            return salario;
        }

    }
    public static class PartTimeEmployee extends EmployeAbs {
        String name;
        public PartTimeEmployee(String name) {
            this.name = name;
        }
        @Override
        public double calculateSalary() {
            return salario * 0.5;
        }
    }
    //Ejercicio 6
    public interface MovableAbs {
        public void move();
    }

    public static class CarAbs implements MovableAbs{
        @Override
        public void move() {
            System.out.println("El carro se esta moviendo");
        }
    }
    public static class Robot implements MovableAbs {
        @Override
        public void move() {
            System.out.println("El robot se esta moviendo");
        }
    }

    //Ejercicio 7

    public static abstract class ApplianceAbs {
        public abstract void turnOn();
        public abstract void turnOff();
    }

    public static class TV extends ApplianceAbs {
        @Override
        public void turnOn() {
           System.out.println("Encendiendo tv");
        }

        @Override
        public void turnOff() {
            System.out.println("Apagando tv");
        }
    }
    public static class WashingMachine extends ApplianceAbs {
        @Override
        public void turnOn() {
            System.out.println("Ensendiendo lavadora");
        }
        @Override
        public void turnOff() {
            System.out.println("Apagando lavadora");
        }
    }

    //Ejercicio 8

    public static class Duck implements FlyableAbs, Swimmable {
        @Override
        public void fly() {
            System.out.println("El pato esta volando");
        }
        @Override
        public void nadar() {
            System.out.println("El pato esta nadando");

        }

    }
    public interface FlyableAbs {
        public void fly();

    }
    public interface Swimmable {
        public void nadar();

    }

    //Ejercicio 9
    public static abstract class Document {
        public abstract void print();
    }
    public static class PDFDocument extends Document {
        @Override
        public void print() {
            System.out.println("Imprimiendo un PDF");
        }
    }
    public static class WordDocument extends Document {
        @Override
        public void print() {
            System.out.println("Imprimiendo Word");
        }
    }
    //Ejercicio 10

    public interface PayableAbs {
        void pay();
    }

    public static class Invoice implements PayableAbs {
        private double amount;

        public Invoice(double amount) {
            this.amount = amount;
        }
        @Override
        public void pay() {
            System.out.println("pagando factura por a " + amount);
        }

    }
    public static class EmployeePayment implements PayableAbs {
        private String employeeName;
        private double salary;

        public EmployeePayment(String employeeName, double salary) {
            this.employeeName = employeeName;
            this.salary = salary;

        }
        @Override
        public void pay() {
            System.out.println("pagado salario de " + salary + " a " + employeeName);
        }
    }

}
