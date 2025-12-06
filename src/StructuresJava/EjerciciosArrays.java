package StructuresJava;

import java.util.ArrayList;

public class EjerciciosArrays {
    static void main() {

        var numbers= new ArrayList<Integer>();
        String[] name={"diego", "pedro", "Pablo"};


        numbers.add(10);
        numbers.add(20);
        numbers.add(2,150);
        System.out.println(numbers.size());
        System.out.println(numbers.get(0) - numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers.contains(30));// este metodo verifica si existe el elemento
        System.out.println(numbers.indexOf(30));
        numbers.clear();//para eliminar to el list
        numbers.add(0,30); //agregar elemento al array en un indixe concreto
        System.out.println(numbers.size());//mostrar tamaño de list
        System.out.println(numbers.indexOf(30));

        // ejercicio suma y promedio
        // Crea un array de tipo int llamado notas con 5 posiciones
        //Asigna valores (notas) a las 5 posiciones usando el indice
        //Recorre el array usando un bocle for tradicional.
        // Calcula la suma total de las notas.
        //Imprime la suma y el promedio de las notas.
        int[] notas= new int[5];
        notas[0]=7;
        notas[1]=9;
        notas[2]=10;
        notas[3]=8;
        notas[4]=5;

        System.out.println(name);
        var primer= new ArrayList<String>();
        primer.add("Ana");
        primer.add("Apellido1");
        System.out.println(primer);







    }
}
