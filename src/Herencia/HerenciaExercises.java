package Herencia;

import java.util.ArrayList;
import java.util.Arrays;

public class HerenciaExercises {
    static void main() {
        // Crea una clase VehiculoHeren con un metodo move(). Luego crea una
        //subclase Car que herede de Vehiculo y agrega el metodo honk()

        var car2 = new Car2();
        car2.move();
        car2.honk();

        //Define una clase PersonHeren con los atributos name y age. Luego
        //crea una subclase Student que agrege el atributo grade y un
        //metodo Study().

        PersonHeren persona = new PersonHeren("Ana", 21);
        System.out.println(persona.name);
        System.out.println(persona.age);

        Student2 studen = new Student2("Diego", 17, "septimo");
        System.out.println(studen.name);
        System.out.println(studen.age);
        System.out.println(studen.grade);
        studen.study();

        //Crea una clase AnimalHeren con el metodo nakeSound(). Has que Dog
        //diga Guau guau y Cat diga miau miau sobre escribiendo ese metodo.
        AnimalHeren animal = new AnimalHeren();
        animal.makeSound();
        var cat = new Cat2();
        cat.makeSound();

        var dog = new Dog2();
        dog.makeSound();


        //La clase EmployeHeren tiene los atributos name y salary. Manager herede
        //de Employe y agrega el atributo department

        EmployeHeren employe = new EmployeHeren("Diego", 300);
        System.out.println("Nombre: " + employe.name4 + " Salario: " + employe.salary4);

        var manager = new Manager("Ana", 120, "Sistema");
        System.out.println("Nombre: " + manager.name4 + " \nSalario: " + manager.salary4 + " \nDepartamento: " + manager.departments);


        // Crea una clase abstracta Shape con un mÃ©todo calculateArea(). Luego
        //implementa ese mÃ©todo en Circle y Rectangle.
        Circle circle = new Circle(5);
        System.out.println("el radio de: " + circle.radius + " es: " + circle.calculateArea());

        Rectangle rectangulo = new Rectangle(4, 4);
        System.out.println("Base: " + rectangulo.base + " y Altura: " + rectangulo.altura + " el Area: " + rectangulo.calculateArea());


        //Crea una clase Bird con el mÃ©todo fly(). Luego crea Eagle que sobrescriba
        //fly() pero tambiÃ©n llame al mÃ©todo original con super.fly().
        BirdHeren bird = new BirdHeren();
        bird.fly();

        Eagle eagle = new Eagle();
        eagle.fly();

        //Haz una clase Device con un constructor que imprima â€œDevice createdâ€.
        //Luego crea Phone que herede de Device y en su constructor imprima â€œPhone
        //readyâ€.
        Phone phone = new Phone();


        //Account tiene un saldo y mÃ©todos para deposit() y withdraw().
        //SavingsAccount hereda y agrega un mÃ©todo addInterest().


        //Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con
        //un mÃ©todo describe() sobrescrito.


        CarHeren car = new CarHeren();
        car.describe1();
        Bike biki = new Bike();
        biki.describe1();


        //Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird.
        // Recorre la lista y llama a makeSound()

        ArrayList<AnimalSound2> animaleess = new ArrayList<>();
        animaleess.add(new DogSound2());
        animaleess.add(new CatSound2());
        animaleess.add(new BirdSound2());
        System.out.println(animaleess);

        for (AnimalSound2 animalSound2: animaleess) {
            animalSound2.makeSound1();
        }



    }

    //VehiculoHeren
    public static abstract class VehiculoHeren {

        //metodo
        public void move() {
            System.out.println("El vahiculo se esta moviendo");

        }


    }

    public static class  Car2 extends VehiculoHeren {
        public void honk() {
            System.out.println("El coche esta tocando la bocina");
        }
    }

    //jercicio  PersonHeren
    public static class PersonHeren {
        //atributos
        String name;
        int age;

        //constructor
        public PersonHeren(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static class Student2 extends PersonHeren {
        //atributo
        String grade;

        //constructor
        public Student2(String name, int age, String grade) {
            super(name, age);
            this.grade = grade;
        }

        //metodo
        public void study() {
            System.out.println(name + " esta estudiando");

        }
    }

    //clase AnimalHeren
    public static class AnimalHeren {
        //metodo
        public void makeSound() {
            System.out.println("El animal esta haciedo");
        }
    }

    public static class Dog2 extends AnimalHeren {
        //metodo
        @Override
        public void makeSound() {
            System.out.println("Guau");
        }

    }

    public static class Cat2 extends AnimalHeren {
        //metodo
        @Override
        public void makeSound() {
            System.out.println("Miau");
        }

    }

    //ejercicio EmployeHeren

    public static class EmployeHeren {
        //atributo
        String name4;
        double salary4;

        //constructor
        public EmployeHeren(String name4, double salary4) {
            this.name4 = name4;
            this.salary4 = salary4;

        }
    }

    public static class Manager extends EmployeHeren {
        //atributo
        String departments;

        //constructor
        public Manager(String name4, double salary4, String departments) {
            super(name4, salary4);
            this.departments = departments;
        }

    }

    //Clase Shape jercicio 5
    public static abstract class ShapeHeren {
        //metod0
        public abstract double calculateArea();

    }

    //Circle area=pi por radio al cuadrado
    public static class Circle extends ShapeHeren {
        //atributo
        private double radius;

        //constructor
        public Circle(double radius) {
            this.radius = radius;
        }

        //metodo
        @Override
        public double calculateArea() {
            return Math.PI * (radius * radius);
        }


    }

    public static class Rectangle extends ShapeHeren {
        //atributos
        double base;
        double altura;

        //constructor
        public Rectangle(double base, double altura) {
            this.base = base;
            this.altura = altura;

        }

        //metodo
        @Override
        public double calculateArea() {
            return base * altura;
        }
    }
    // ejercicio 6

    public static class BirdHeren {
        //metodo
        public void fly() {

            System.out.println("EL pajaro esta volando");
        }

    }

    public static class Eagle extends BirdHeren {
        @Override
        public void fly() {
            super.fly();
            System.out.println("El aguila esta volando");
        }

    }

    //ejercicio
    public static class DeviceHeren {

        //constructor
        public DeviceHeren() {
            System.out.println("Device created");
        }
    }

    public static class Phone extends DeviceHeren {

        public Phone() {
            super();
            System.out.println("Phone ready");
        }

    }

    //ejercicio 8



    //ejercicio 9

    public static abstract class VehicleBase {
        public abstract void describe1();

    }

    public static class CarHeren extends VehicleBase {
        @Override
        public void describe1() {
            System.out.println("soy un carro");
        }

    }

    public static class Bike extends VehicleBase {
        @Override
        public void describe1() {
            System.out.println("soy una bicicleta");
        }


    }

    public static class Truck extends VehicleBase {
        @Override
        public void describe1() {
            System.out.println("soy un carro");
        }

    }

    //ejercicio 10

    public static abstract class AnimalSound2 {
        public abstract void makeSound1();
    }
    public static class DogSound2 extends AnimalSound2 {
        public void makeSound1() {
            System.out.println("el perro hace guau");

        }

        }
    public static class CatSound2 extends AnimalSound2 {
        public void makeSound1() {
            System.out.println("El gato hace miau");
        }
    }
    public static class BirdSound2 extends AnimalSound2 {
        public void makeSound1() {
            System.out.println("el pajaro hace Tweet");
        }

    }


}

