package Excepciones;

import javax.security.auth.login.LoginException;
import java.lang.Exception;
import java.util.Locale;

public class EjerciciosExcepciones {
    static void main() {
        //Divide dos numeros almacenado en dos variables. Maneja la division
        //por cero con try-cath

        int num1 = 10;
        int num2 = 0;
        try {
            int division = num1 / num2;
            System.out.println(division);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir para cero: ");


            //Crea una array de 3 elementos e intenta acceder al indice 5. Captura
            //el ArrayIndexOutOfBoundsException.

            int[] numeros = {1, 2, 3};
            try {
                System.out.println(numeros[5]);
            } catch (ArrayIndexOutOfBoundsException index) {
                System.out.println("Error: indixes no existe");

            }

            int n = numeros.length;

        }

        /*3. Crea una variable String nula e intenta imprimir su longitud
        Maneja el NullPointerException*/

        String apellido = "Zambrano";
        apellido = null;
        try {
            System.out.println(apellido.length());
        } catch (NullPointerException e) {
            System.out.println("Error: el string es nulo");
        }

        //4.Escribe una funcion que transforma texto a numero. Usa try-catch
        // para manejar entradas no validas (NumeroFormatException

        //var h = transformacion("hola");
        //System.out.println(h);
        System.out.println(transformacion("1245"));


        /*5. Escribe un programacon el bloque finally que se ejecute siempre
         * haya o no aya error */

        System.out.println(primerDato("HOLA"));

        //6. Usa throw para lanzar un IllegalArgumentException si un numero
        //introducido es negativo.
        try {
            negativo(-8);
        } catch (IllegalArgumentException e) {
            System.out.println("Error revisando el numero " + e.getMessage());

        }

        //7. Crea una clase TemperatureChecker que lanza una excepcion
        //personalizada si la temperatura es menor a -50 o mayor a 50
        try {
            var tempe = new TemperatureChecker(51);
        } catch (Excepcion7 e) {
            System.out.println("Error: " + e.getMessage());

        }

        //8. Crea un programa con varios bloques catch: uno para
        // ArithmeticException, otro para ArrayIndexOutOfBoundsException
        int[] array1 = {1, 2, 3};
        try {
            int resultado1 = 10/0;
            System.out.println(array1[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error de array: Indice fuera de limite");
        }catch (ArithmeticException e) {
            System.out.println("Error Aritmetico: " );
        }catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
        }

        //segundo ejemplo
         var cel = new Celular();
        try {
            cel.numeroCelular(1234567896);
        } catch (ArithmeticException e) {
            System.out.println("el numero es " + e.getMessage());
        }

        //9. Crea una funcion checkPassword(String pass) que lance una
        //excepcion si la contraseña es demaciado corta.45
        try {
            checkPassword3("1234567");
        } catch (IllegalArgumentException e) {
            System.out.println("Error de contraseña: "+ e.getMessage());
        }

        //10. Implementa una clase LoginSystem que use una excepcion personalizada
        //LoginFailedException si el usuario o contraseña son incorrecto.
        System.out.println("///Ejercicio 10");
        LoginSystem loginSystem = new LoginSystem();
        try {
            loginSystem.login("admin", "password123");
        } catch (LoginFailedException e) {
            System.out.println("Error de login: " + e.getMessage());
        }
        try {
            loginSystem.login("usuario", "incorrecta");
        } catch (LoginFailedException e) {
            System.out.println("Error de login: " + e.getMessage());
        }





    }

    public static String transformacion(String dato) {
        try {
            int numero = Integer.parseInt(dato);
            return "numero convertido " + numero;
        } catch (NumberFormatException e) {
            return "Error: no se puede covertir " + dato + " a numeros";



        }

    }

    public static String primerDato(String sms) {
        String mayusscula = sms.toLowerCase();
        return "" + mayusscula;
    }
    //ejercicio 6
    public static void negativo(int numero) {

        if (numero <0 ) {
            throw new IllegalArgumentException("Error: numero negativo: " + numero);
        } else {
            System.out.println("EL numero es positivo: " + numero);
        }

    }
    //Ejercicio 7
    public static class TemperatureChecker {
        public TemperatureChecker(int temp) {
            if (temp < -50 || temp > 50) {
                throw new  Excepcion7("temperatura fuera de rango: " + temp);
            } else {
                System.out.println("temperatura correcta");
            }

        }
    }
    //Ejercicio 8
    public static class Celular {
        public void numeroCelular(int numCelular) throws ArithmeticException {
            String cadena = String.valueOf(numCelular);
            int contar = cadena.length();
                if (contar == 10) {
                    System.out.println("Numero correcto");
                } else {
                    throw new ArithmeticException("Error: tiene que tener 10 numeros");

                }
           }
    }
    //Ejercicio 9
    public static void checkPassword3(String pass) {
        if (pass.length() <8) {
            throw new IllegalArgumentException("La contraseña debe tener almenos 8 caracteres");
        } else {
            System.out.println("Contraseña valida");
        }
    }
    //Ejercicio 10
    public static class LoginSystem {
        private final String validUser="admin";
        private final String validPassword="password123";

        public void login(String userName, String password) throws LoginFailedException {
            if (!userName.equals(validUser) || !password.equals(validPassword)) {
            throw new LoginFailedException("Usuario o contraseña incorrecto");
            } else {
                System.out.println("Login exitoso para el usuario: " + userName);
            }
        }

    }
}

