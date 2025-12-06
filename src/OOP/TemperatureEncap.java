package OOP;

public class TemperatureEncap {
    //atributo
    private double celsius;

    //metodo
    public void setCelsius(double celsius) {
        if (celsius <=100 && celsius >=-100) {
            this.celsius=celsius;
            System.out.println("a ingresado: " + celsius + " celsius");
        }else {
            System.out.println("Ingrese valores correctos de celsius");
        }
    }
    public double getCelsius() {
        return celsius;
    }
}
