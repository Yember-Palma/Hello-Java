package StructuresJava;

public class Arrays {

    static void main() {
        //como declarar un arrays
        int [] numbers =new int[3];
        System.out.println(numbers);
        String[] name = {"Ana", "Diego", "Fernando"};
        System.out.println(name);
        //acceso al StructuresJava.Arrays
        System.out.println(name[0]);
        System.out.println((new String[3])[0]);//es lo mismo que crear un arrays basio

        //modificar datos de un StructuresJava.Arrays
        numbers[0]=1;
        numbers[1]=10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        //limpieza del arrays
        name[0] =null;// los null son compatible con los objetos string, booleans
        System.out.println(name[0]);

        //arrays de booleans
        boolean[] boole= new boolean[5];
        System.out.println(boole[4]);
        boole[0]=true;
        boole[1]=false;

    }
}
