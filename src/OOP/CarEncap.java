package OOP;

public class CarEncap {
    private String model;
    private int speed;
    private final int MAX_SPEED = 120;

    public CarEncap(String model) {
        this.model = model;
        this.speed = 0;
    }

    public void accelerate(int amount) {
        if (amount > 0) {
            int newSpeed = speed + amount;
            if (newSpeed <= MAX_SPEED) {
                speed = newSpeed;
                System.out.println("Acelerando +" + amount + " km/h");
            } else {
                speed = MAX_SPEED;
                System.out.println("Velocidad limitada al maximo de " + MAX_SPEED + " km/h");
            }
        } else {
            System.out.println("La cantidad a acelerar debe ser positiva");
        }
    }

    public void brake(int amount) {
        if (amount > 0) {
            int newSpeed = speed - amount;
            if (newSpeed >= 0) {
                speed = newSpeed;
                System.out.println("Frenando -" + amount + " km/h");
            } else {
                speed = 0;
                System.out.println("Vehiculo detenido");
            }
        } else {
            System.out.println("La cantidad a frenar debe ser positiva");
        }
    }

    public void showStatus() {
        System.out.println("Vehiculo: " + model + ", Velocidad actual: " + speed + " km/h");
    }

}
