package Extrass;
import OOP.Person; //se importo clase Person
import java.util.Scanner;

public class Extra {
    static String  globalVariable = "VARIABLE GLOBAL";
    static void main() {
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int age = scanner.nextInt();

        System.out.println("Su edad es: " + age);

       Person personass = new Person("ana", 56);// importado de la clase Person
       personass.saludo();

       String apellido = "Zambrano";
       //apellido = null;
       if (apellido != null) {//esto verifica si un objeto es nulo
           System.out.println(apellido.toLowerCase());
       }

        System.out.println(globalVariable.toUpperCase());
       prueba();

    }
    public static void prueba() {
        System.out.println(globalVariable.toLowerCase());
    }

}




