public class Contraseña {

    static void main() {
        //Escriba un programa que almacene la cadena de caracteres Contraseña
        //en una variable, pregunte al usuario por la contraseña e imprima por pantalla si
        //la contraseña introducida por el usuario coincide con la guardada en la variable
        //sin tener encuenta mayuscula y minuscula

        String clave="admin12345";
        String contrasena="admin12345";
        if (clave.trim().equalsIgnoreCase(contrasena)){
            System.out.println("Bienvenido contraseña correcta");
        }else {
            System.out.println("contraseña incorrecta");
        }

        //Escribir un programa que pida al usuario dos numero entero y muestre por pantalla
        //su divicion. Si el divisor es cero en el programa debe mostrar un error

        int dividendo=0;
        int divisor=2;
        if (divisor==0){
            System.out.println("error");
        } else{
            int divicion=dividendo/divisor;
            System.out.println(String.format("el resultado es %d", divicion));
        }

        //Escribir un programa que pida al usuario un numero entero y muestre
        //por pantalla si es par o impar

        int num=21;
        if (num % 2==0){
            System.out.println("el numero es par");
        }else {
            System.out.println("el numero es impar");
        }
        // para tributar un determinado impuesto se debe ser mayor de 16 años
        //y tener unos ingresos iguales o superiores a 1000 dolares mensuales
        //Escribir un programa que pregunte al usuario su edad y sus ingresos
        // mensuales y muestre por pantalla si el usuario tiene que tributar o no

        int edad=16;
        int ingresos=1000;
        if (edad >=16 && ingresos>=1000){
            System.out.println("tiene que tributar");
        }else {
            System.out.println("no tiene que tributar");
        }


    }

}
