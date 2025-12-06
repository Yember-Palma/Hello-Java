package OOP;

public class Book {
    //Atributos
    String title;
    String author;

    //Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    //metodo
    public void libros() {
        System.out.println("El titulo es: " + title + " El autor es: " + author);
    }
}
