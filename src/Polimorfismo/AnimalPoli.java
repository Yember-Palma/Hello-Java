package Polimorfismo;

public class AnimalPoli {
    public  void makeSound() {
        System.out.println("El animal hace un sonido");
    }
    public static class Dog45 extends AnimalPoli {

        @Override
        public void makeSound() {
            System.out.println("El perro hace: GUAU");

        }
    }

    public static class Cat90 extends AnimalPoli {
        @Override
        public void makeSound() {
            System.out.println("El gato hace: MIAU");
        }
    }
    public static class Cow8 extends AnimalPoli {
        @Override
        public void makeSound() {
            System.out.println("La vaca hace: MUUU");
        }
    }
}
