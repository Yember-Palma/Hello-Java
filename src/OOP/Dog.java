package OOP;

public class Dog {

    private String name;

    //constructor
    public Dog(String name) {
        this.name = name;
    }
    public void bark() {
        System.out.println(name + " hace: Guau guau");
    }
    public String getName() {
        return name;
    }
}
