package LogicaProgramacion;

import java.util.Scanner;

/*primeros pasos ejercicios */
public class ExercisesHello {
    static void main (String[]args){
            // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
            System.out.println("Jose Maria");

            // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
            System.out.println("hola \n Mundo"); //esta linea imprime Hola en una linea
            // y MUNDO en otra linea

            // 3. Añade un comentario sobre lo que hace cada línea del programa.

            // 4. Crea un comentario en varias líneas.

            // 5. Imprime tu edad, tu color favorito y tu ciudad.
            System.out.println("azul");
            System.out.println(25);
            System.out.println("Cali");

            // 6. Explora los diferentes System.XXX.println(); más allá de "out".
            System.err.printf("¡ERROR:Archivo no encontrado!");
            Scanner sc = new
                    Scanner(System.in);
            System.getProperty("name", "os");


            // 7. Utiliza varios println para imprimir una frase.
            System.out.print("en la misma linea");
            System.out.printf("precio: %.2f", 28.9); /* el "%.2f" se agrega para el objeto 28.9 es decimal */

            // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
            System.out.println("   _._  ");
            System.out.println("  /    \\");
            System.out.println(" | o  o |");
            System.out.println(" |   *  |");
            System.out.println(" |  \\_/ |");
            System.out.println("   \\___/");
            System.out.println("    \\o/");


            // 9. Intenta ejecutar el programa sin el metodo main y observa el error.
            // no deja ejecutar

            //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?

        }



}