package Modulo1Master;

public class CalcularImpuesto5 {
    static void main() {

        new CalcularImpuesto5();
        System.out.println("el impuesto es " + Impuesto(10, 0.12));




        }




    public static double Impuesto(int precio7, double tasa) {
        double impuesto = precio7 * tasa;
        return impuesto;

    }

}
