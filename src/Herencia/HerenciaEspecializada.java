package Herencia;

import OOP.CarEncap;

import javax.xml.namespace.QName;

public class HerenciaEspecializada {
    static void main() {

        Animal animal = new Animal("Lia");
        animal.eat();

        var dog = new Dog1("Rufus", 3);
        dog.eat();

        var bird = new Bird1("fenix");
        bird.eat();
        bird.flyy();
    }

    public static class Animal {

        String name;

        //constructor

        public Animal(String name) {
            this.name = name;
        }

        //metodo
        public void eat() {
            System.out.println("el animal con nombre " + name + " esta comiendo");
        }
    }

    public static class Dog1 extends Animal {

        int age;

        public Dog1(String name, int age) {
            super(name);
            this.age = age;

        }
    }

public static class Cat1 extends Dog1 {

        public Cat1(String name, int age) {
            super(name, age);
        }


    }
public static class Bird1 extends Animal {
        public Bird1(String name) {
            super(name);
        }

    //metodo
    public void flyy() {
        System.out.println("esta volando " + name);
    }
}
}
