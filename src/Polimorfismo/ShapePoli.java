package Polimorfismo;

public abstract class ShapePoli {
    public abstract double calculateArea();
}

    class Circle9 extends ShapePoli {
        double radio;

        public Circle9(double radio) {
            this.radio = radio;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radio * radio;
        }
    }
    class Regtangle9 extends ShapePoli {
        double altura;
        double base;

        public  Regtangle9(double altura, double base) {
            this.altura = altura;
            this.base = base;
        }

        @Override
        public double calculateArea() {
            return base * altura;
        }

    }





