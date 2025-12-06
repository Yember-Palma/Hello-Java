package StructuresJava;

import java.util.ArrayList;

public class ArraysListas {
    static void main() {

        //StructuresJava.Arrays listas
        //sirve para declarar elementos ilimitados
        //declaracion y creacion
        ArrayList<String> apellido= new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();//notacion mas clasica
        var numbers = new ArrayList<Integer>();//integar es el equivalente de los datos primitivos

        //tamaño de names
        System.out.println(names.size());

        //Añadir elementos
        numbers.add(10);
        names.add("Diego");
        names.add("Ana");
        names.add("Leandro");
        System.out.println(names);//imprime names
        apellido.add(0,"Apellido2");
        System.out.println(names.size());
        System.out.println(numbers.size());

        //acceder a los elementos
        System.out.println(names.get(0));//get sirve para acceder al elemento
        System.out.println(names.getFirst());
        System.out.println(apellido.get(0));

        //modificar los elementos
        names.set(1, "ana@gmail.com");
        System.out.println(names.get(1));//imprimimos para verificar

        //eliminar datos de la lista
        names.remove(2);
       // System.out.println(names.get(2));//esto da error ya q se elimino el indice 2
        System.out.println(names.size());

        //buscar elementos

        System.out.println(names.contains("Fernanda"));
        System.out.println(names.contains("Maria"));
        System.out.println(apellido.contains("Apellido2"));


        //Limpiar arrays list
        //names.clear();//elimina todo el array
        System.out.println(names.size());
        System.out.println(apellido.indexOf("Apellido2"));//muestra el numero de indice que pertenese ese elemento






    }


}
