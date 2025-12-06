package OOP;

public class Persona {
   //Atributos
    String name;
    int edad;

    //Constructor
    public Persona(String name, int edad) { //el constructor tiene que llevar el mismo nombre de la clase
        this.name = name;     //este constructor es una buena practica
        this.edad = edad;     //permite que los parametros no queden bacios
    }

    //Metodos
    public void saludar() {
        System.out.println("Hola, mi nombre es " + name + " y tengo " + edad + " años");
    }
}
