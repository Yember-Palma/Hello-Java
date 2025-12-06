package Polimorfismo;

import java.util.ArrayList;

public class EjercicioPolimorfismo {
    static void main() {
        //Crea una clase AnimalPoli con el metodo makeSound(). Luego crea subclese
        //Dog, Cat y Cow que sobreescriban ese metodo con sonido diferentes.
        // Llama al metodo desde una lista animal

        ArrayList<AnimalPoli> animales34 = new ArrayList<>();
        animales34.add(new AnimalPoli.Dog45());
        animales34.add(new AnimalPoli.Cat90());
        for (AnimalPoli animales43 : animales34) {
            animales43.makeSound();

        }
        var vaca = new AnimalPoli.Cow8();
        vaca.makeSound();

        //Crea una clase ShapePoli con el metodo calculateArea(). Luego implementa
        //subclases Circle Y Rectangle con sus propias formulas. Usa una lista
        //de SapePoli para recorrer e imprimir el area de varias figuras

        ArrayList<ShapePoli> shape9 = new ArrayList<>();
        shape9.add(new Circle9(5));
        shape9.add(new Regtangle9(2, 5));
        shape9.add(new Circle9(10));

        for (ShapePoli shapes : shape9) {
            System.out.println(shapes.calculateArea());
        }

        //Crea una clase PrinterPoli con varios metodos print() sobrecargado
        //que acepten diferentes tipos de parametros (String, int, double).
        //llama a cada uno desde Main
        var printer = new PrinterPoli();
        printer.print("hola");
        printer.print(5);
        printer.print(6.2);

        /* Crea una clase GreeterPoli con dos metodos greet(): uno que salude con
         hola y otro que escriba un nombre y swalude con Hello, [nombre]*/

        var greeterr = new GreeterPoli();
        greeterr.greed("ana");
        greeterr.greed("diego");

        //5. Crea una clase VehiclePoli con u8n metodo start(). Luego crea
        //Car9, Bike9 y Truck9 que sobrescriban ese metodo. Recorre una lista
        //ArrayList<Vehicle> para llamar a start() en cada uno

        VehiclePoli container = new VehiclePoli();
        ArrayList<VehiclePoli> list9 = new ArrayList();
        list9.add(container.new Car9());
        list9.add(container.new Bike9());
        list9.add(container.new Truck9());

        for (VehiclePoli lista9 : list9) {
            lista9.start();

        }

        //6. Crea una clase NotificationPoli con metodo send(), y subclases
        //EmailNotification, SMSNotification. Luego crea una funcion
        // sendNotification(Notification n) que reciba cualquier tipo y lo
        // ejecute

        ArrayList<NotificationPoli> notifi = new ArrayList<>();
        notifi.add(new NotificationPoli.EmailNotification1());
        notifi.add(new NotificationPoli.SMSNotification1());

        for (NotificationPoli noti : notifi) {
            noti.send1();
        }

        //7. Crea una funcion ShowAnimalType(Animal animal) que imprima el
        //tipode animal. Pasa diferentes subclases (Dog, Cat, Horse)
        // para que cada una imprima su tipo con su propio getType(
        //sobrescrito
        showAnimalType(new CatType());
        showAnimalType(new HorseType());
        showAnimalType(new DogType());
        // 88888888
        ConverterPoli dsto1= new ConverterPoli();
        System.out.println(dsto1.convertPoli(2, 23.1, "ds"));




    }
    public static abstract class AnimalType {
        public abstract String getType();
    }

    public static class DogType extends AnimalType{
        @Override
        public String getType() {
            return "Perro";
        }
    }
    public static class CatType extends AnimalType {
        @Override
        public String getType() {
            return "Gato";
        }
    }
    public static class HorseType extends AnimalType {
        @Override
        public String getType() {
            return "Caballo";
        }
    }
    public static void showAnimalType(AnimalType animalType) {
        System.out.println("esto es un: " + animalType.getType());




    }
    //Crea una clase ConverterPoli con metodos convert(int), convert(double)
    // y convert(String) que devuelvan diferentes formatos de texto
    public static class ConverterPoli {
        public String convertPoli(int num, double num2, String letra) {
            return num + ":" + num2 + " : " + letra;
        }

    }
}

