package Abstracion;

public class Abstrac {
    static void main() {

        var vaca = new Vaca();
        vaca.sleep();
        vaca.Sound();

        var caballo = new Caballo();
        caballo.sleep();
        caballo.Sound();

        var pajaro = new Ave();
        pajaro.volar();



    }
    public static abstract class Mamifero {

        public abstract void Sound();
        public void sleep() {
            System.out.println("El animal esta durmiendo");
        }

    }
    public static class Vaca extends Mamifero {
        @Override
        public void Sound() {
            System.out.println("MUUUU");
        }
        @Override
        public void sleep() {
            System.out.println("La Vaca esta durmiendo");
        }

    }
    public static class Caballo extends Mamifero {
        @Override
        public void Sound() {
            System.out.println("Relincha");
        }

        @Override
        public void sleep() {
            System.out.println("El caballo esta durmiendo");
        }
    }
        public static class Ave extends Mamifero implements Volar {  //se implementa interface
            @Override
            public void Sound() {
                System.out.println("silva");
            }

            @Override
            public void volar() {
                System.out.println("El ave esta volando");
            }
        }

    //interface
    public interface Volar {
        public void volar();
    }
}
