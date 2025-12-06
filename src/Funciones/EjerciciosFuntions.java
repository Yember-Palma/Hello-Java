package Funciones;

import java.util.ArrayList;

public class EjerciciosFuntions {
    static void main() {
        hello(); //primer ejercicio
        saludo("carlos"); //ejercicio 2
        resta(5, 3); //ejercicio 3
        cuadrado(5); //ejercicio 4
        ParImpar((8)); //ejercicio 5
        var ed= edad(25); //ejercicio 6
        System.out.println(ed);
        cadena("12345678"); //ejercicio 7
        int[] numeros7 = {5, 6, 8};
        double average = arrayy(numeros7);//ejercicio 8
        System.out.println("La media del arrays es: " + average);
        System.out.println(factorial(5)); //ejercicio 9
        ArrayList< String> recor12 = new ArrayList<>(); //ejercicio 10
        recor12.add("a");
        recor12.add("b");
        recor12.add("c");

        recorer(recor12);

        printInfo("Simon", 28, "Ing Sistemas");

    }
    //crea una funcion que imprima "A te doy la bienvenida al curso de Java"
    public static void hello() {
        System.out.println("A te doy la bienvenida al curso de Java");

    }
    //Escribe una funcion que reciba un nombre como parametro y salude
    //a esa persona
    public static void saludo(String names1) {
        System.out.println("Hola " + names1 + " Bienvenido a Java");

    }
    //has un metodo que reciba dos numeros enteros y devuelva su resta
    public static void resta(Integer num1, Integer num2) {
        int resta =num1 - num2;
        System.out.println("La resta de: " + num1 + " y " + num2 + " es: " + resta);
    }
    //Crea un metodo que calcule el cuadrado de un numero(n*n)
    public static void cuadrado(int numero) {
        int cuadr= numero * numero;
        System.out.println("el cuadrado es: " + cuadr);

    }
    //Escriba una funcion que reciba un numero y diga si es par o impar
    public  static boolean ParImpar(int nume) {
        if (nume % 2==0) {
            System.out.println("el numero: " + nume + " es par");
            return false;
        }
        System.out.println("el numero: " + nume + " es impar");
        return true;
    }
    //Crea un metodo que reciba una edad y retorne true si es mayor de edad
    // y false en caso contrario
    public static boolean edad(int edad1) {
        if (edad1 <=17) {
            return false;
        }
        System.out.println("es mayor de edad: " + edad1);
        return true;
    }
    //Implemente una funcion que reciba una cadena y retorne su longitud
    public static void cadena(String Cadena) {
        int longi=0;
        for (int i = 0; i < Cadena.length(); i++) {
            longi = i ;
        }
        System.out.println(" la longitus de la cadena es " + longi);
    }
    //Crea un metodo que reciba un array de enteros, calcule su media
    //y lo retorna
    public static double arrayy( int [] numeros7) {
        if (numeros7.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int numero: numeros7) {
            sum += numero;
        }
        return (double) sum / numeros7.length;


    }
    //escriba un metodo que reciba un numero y retorne su factorial
    public static double factorial(int fac1) {
        if (fac1 <= 1) {
            return 1;
        }
        int resultado = 1;
        for (int f = 2; f <= fac1; f++) {
            resultado *= f;

        }
        return resultado;

    }
    //Crea una funcion que reciba un ArrayList<String> y lo recorra
    //mostrando cada elemento
    public static void recorer(ArrayList<String> recor1) {
        System.out.println("elementos del array");
        for (String recorr1: recor1) {
            System.out.println("-" + recorr1);
        }

    }
    //Ejemplo adicional de sobrecarga de metodos
    public static void printInfo(String name8) {
        System.out.println("Nombre" + name8);

    }
    public static void printInfo(String name8, Integer age) {
        System.out.println("nombre: " + name8 + " Edad: " + age);
    }
    public static void printInfo(String name8, Integer age, String profesion) {
        System.out.println("Nombre: " + name8+ " Edad: " + age + " Profesion: " + profesion);

    }
}
