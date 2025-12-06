package Herencia;

public class ExarciceHerencia {
    static void main() {

        Animal animal = new Animal();
        animal.name ="lia";
        animal.eat();

        var dog = new Dog();
        dog.name = "Rufus";
        dog.eat();

        var bird = new Bird();
        bird.name = "fenix";
        bird.eat();
        bird.fly();
    }
    public static class Animal {
        String name;

        //metodo
        public void eat() {
            System.out.println("el animal con nombre " + name + " esta comiendo");
        }
    }
    public static class Dog extends Animal{

        public void eat() {
            System.out.println("el perro con nombre " + name + " esta comiendo");
        }

    }
    public static class Cat extends Animal {

    }
    public static class Bird extends Animal{

        //metodo
        public void fly() {
            System.out.println("esta volando");
        }
    }
}
