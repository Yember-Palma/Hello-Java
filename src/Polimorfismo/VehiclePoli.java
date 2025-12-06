package Polimorfismo;

public class VehiclePoli {
    public void start() {
        System.out.println("El vehiculo esta Arrancando");
    }
    public class Car9 extends VehiclePoli{
        @Override
        public void start() {
            System.out.println("Arrancando el carro ");
        }


    }
    public class Bike9 extends VehiclePoli {
        @Override
        public void start() {
            System.out.println("Voy en vicicleta ");
        }
    }
    public class Truck9 extends VehiclePoli {
        @Override
        public void start() {
            System.out.println("Arrancando el camion ");
        }

    }
}
