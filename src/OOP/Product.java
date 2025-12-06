package OOP;

public class Product {
    //atributos
     private String nombre;
     private double precio;

    //constructor
    public Product(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;

    }
    //metodo

    public double Descuento() {
        double descuento = (precio * 0.10);
        double aPagar = precio - descuento;
        System.out.println("su descuento es: " + descuento + " total a pagar es: " + aPagar);
        System.out.println(" en total es: "+ (aPagar + aPagar));
        return descuento;
    }



}
