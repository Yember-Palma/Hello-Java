package StructuresJava;

import java.util.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;

public class EjerciciosDeEstructuras {
    static void main() {
        // crea un array con 5 valore e imprime su longitud
        int[] numeros={1,2,3,4,5};
        System.out.println(numeros.length);

        System.out.println(numeros[2]);

        //Modifica uno de los valores del array e imprime el valor
        //del indice antes y despues de modificar
        numeros[2]=6;
        System.out.println(numeros[2]);

        //Crea un ArrayLiss vacio
        var ArrayVacio= new ArrayList<>();

        System.out.println(ArrayVacio.size());

        //Añade 4 valores al ArrayList y elimina uno a continuacion

        ArrayVacio.add("Ana");
        ArrayVacio.add("Diego");
        ArrayVacio.add("Apellido1");
        ArrayVacio.add("Apellido2");
        System.out.println(ArrayVacio);

        ArrayVacio.remove(1);
        System.out.println(ArrayVacio);

        //Crea un HashSet con dos valores diferentes

        HashSet<String> valores = new  HashSet<>();
        valores.add("1234567890");
        valores.add("123456789");
        System.out.println(valores);

        //Añade un nuevo valor repetido y otro sin repetir al Hash
        valores.add("123456789");
        System.out.println(valores);
        valores.add("987654321");
        System.out.println(valores);

        //Elimina uno de los elementos del HashSEt

        valores.remove("123456789");
        System.out.println(valores);

        //Crea un HasMap donde la clave sea un nombre y el valor el numero de
        // telefono. Añade 3 contactos.
        HashMap<String, String> contactos= new HashMap<>();
        contactos.put("Ana","0999999999");
        contactos.put("Diego", "0988888888");
        contactos.put("Apellido1", "0977777777");
        System.out.println(contactos);
        //Modifica uno de los contactos y elimina otro
        contactos.replace("Ana", "0911111111");
        System.out.println(contactos);
        contactos.remove("Diega");
        System.out.println(contactos);

        //Dado un array, transformalo en un ArrayList, a continuacion en un
        //HashSet y finalmente en un HashMap con clave y valor iguales.
        System.out.println("transformar un Arrays a UN ArrayList");
        String[] Frutas = {"uva", "manzana", "pera"};
        ArrayList<String> Frutas1 = new ArrayList<>(Arrays.asList(Frutas));
        System.out.println(Frutas1);
        //metodo 2 Array - ArrayList
        String[] objetos= {"carro", "casa","taladro"};
        ArrayList<String> objetos1 = new ArrayList<>();
        //Collection.(objetos1, objetos);














    }
}
