package OOP;

import java.util.ArrayList;

public class Person {
    String name;
    int edad;

    //constructor
public Person(String name, int edad) {
    this.name = name;
    this.edad = edad;
}

    public void saludo() {
        System.out.println("hola mi nombre es " + name + " y tengo " + edad + " años");

    }
}
