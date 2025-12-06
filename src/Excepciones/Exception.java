package Excepciones;

import javax.swing.table.TableRowSorter;

public class Exception {
    static void main() {

        //manejo de excepciones

        System.out.println("hola");

        try {
            var resul = 10 / 0;
            System.out.println(resul);
        } catch (ArithmeticException e) {
            System.out.println("Error" + e);
        }


        System.out.println("fin");

        //llamar a throw
        var trowejemplo = new ThrowExample();
        try {
            trowejemplo.checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error revisando la edad: " + e.getMessage());
        }

        try {
            trowejemplo.checkScore(50);
        } catch (CustomException e) {
            System.out.println("Error revisando la puntuacion: " + e.getMessage());

        }




    }
}
