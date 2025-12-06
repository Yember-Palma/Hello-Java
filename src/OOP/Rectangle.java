package OOP;

public class Rectangle {
    //atributo
    private double width;
    private double height;

    //constructor
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }


    public void showCalculations() {
        System.out.println("la base es: " + width + " la altura es: " + height);
        System.out.println("el area es: " + calculateAre());
        System.out.println("el perimetro es: " + calculatePerimetro());
    }
    private double calculateAre(){
        return width * height;
    }
    private double calculatePerimetro(){
        return 2 * (width + height);
    }
}

