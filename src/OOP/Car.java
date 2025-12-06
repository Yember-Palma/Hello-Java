package OOP;

public class Car {
    //Atributo
    String brand;
    String model;

    //constructor
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;

    }

    //Metodo
    public void showData() {
        System.out.println("La marca es: " + brand + " Modelo: " + model);
    }


}
