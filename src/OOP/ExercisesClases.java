package OOP;

import StructuresJava.ArraysListas;

import java.util.ArrayList;
import java.util.Arrays;

public class ExercisesClases {
    static void main() {
        //Crea Una clase Book con atributos title y author
        //Crea un objeto y muestra sus datos
        var book = new Book("El señor de los añillos", "mmmmmmmss");
        book.libros();

        //Crea una clase Dog con un metodo bark() que imprima un sonido
        var dog = new Dog("Kripto");
        dog.bark();

        var dog2 = new Dog("bluto");
        dog2.bark();

        //Añade un constructor a la clase Book que reciba title y autor
        var book2 = new Book("Invierte en Bitcoin o Escluvitud", "JJ Chagerbet");
        book2.libros();

        //Crea una clase car con atributos brand model y un metodo showDate().
        Car car = new Car("BMW", "BMW X7");
        car.showData();

        //Crea una clase Student con atributo score y un metodo que diga
        // si aprovo mayor o igual a 60
        var calif = new Student();
        calif.score =50;
        calif.Calificacion();

        //Crea una clase BankAccount con atributo balance y un metodo deposit()
        //que sume el saldo

        BankAccount bankAccount = new BankAccount("6",56);
        bankAccount.saldo();
        bankAccount.retiro(6);

        //Crea una clase Rectangle con metodos para calcular el area
        //y el parametro

        Rectangle rectangle = new Rectangle(6,4);
        rectangle.showCalculations();

        //Crea una clase Worker que reciba nombre y salario
        //y un metodo para mostrar su salario

        Worker worker = new Worker("Ana", 1000);
        worker.mostrar();

        //Crea varios objetos Person y gusradalos en un ArrayList

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Diego", 25));
        people.add(new Person("Ana", 18));
        System.out.println("Lista de personas: ");
        for (Person person: people) {
            person.saludo();
        }
        // Crea una clase Producto y un metodo que aplique un descuento
        //sobre su precio

        ArrayList<Product> produc = new ArrayList<>();
        produc.add(new Product("Atun", 1.50));
        produc.add(new Product("Arroz", 2));
        produc.add(new Product("Deja", 3.5));
        for (Product product: produc) {
            product.Descuento();
        }


    }
}
