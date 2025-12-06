package OOP;

public class RectangleEncap {
    //atributos
    private double width;
    private double height;

    //constructor

    //metodos
    public double calculateArea() {
        return width * height;
    }
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else System.out.println("Ingrese una base mayor a cero");
    }
    public void setHeight(double height) {
        if (height >0) {
            this.height = height;
        } else {
            System.out.println("Ingrese altura mayor a cero");
        }
    }
}
