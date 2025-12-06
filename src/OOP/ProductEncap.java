package OOP;

public class ProductEncap {
    //atributos
    private double price;

    //constructor
    public ProductEncap(double price) {

        this.setPrice(price);
    }

    //metodo

    public void setPrice(double price) {
        if (price >0) {
            this.price = price;
            System.out.println("el precio es " + price);
        } else {
            System.out.println("Precio ¡Invalido!");
        }
    }

}

