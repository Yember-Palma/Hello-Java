package StructuresJava;

import java.util.HashSet;

public class Set {
    static void main() {
        //como declarar y crear un set
        HashSet<String> name= new HashSet<>();//tipo String

        var numbers = new HashSet<Integer>();// tipo numero

        //ver tamaño
        System.out.println(name.size());

        //Añadir elemento
        name.add("Ana");
        name.add("Leandro");
        name.add("Pablo");
        name.add("ana@gmail.com");

        System.out.println(name);
        System.out.println(name.size());
        //nota:Los SET es una estructura desordenada porque la manera
        //que tiene de guardar los elementos es desordenada de forma alealtoria
        //los SET almasenan hashens


        //Buscar elemento
        System.out.println(name.contains("Leandro"));

        //eliminar elemento
        name.remove("Pablo");
        System.out.println(name);
        System.out.println(name.size());

        name.add("Ana");
        name.add("Ana");
        System.out.println(name);

        // unir dos string
        var coutries = new HashSet<String>();
        coutries.add("Ecuador");
        coutries.add("venezuela");
        coutries.add("colombia");
        coutries.add("Ana");

        name.addAll(coutries);//unir String
        System.out.println(name);

        System.out.println(name);

        //
        name.removeAll(coutries);//elimina solo countries ya que no pertenece a name
        System.out.println(name);

        //dejar solo los elementos comunes
        name.retainAll(coutries);//dejar elementos no comunes
        System.out.println(name);







    }
}
