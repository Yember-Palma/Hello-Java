package StructuresJava;

import java.util.HashMap;

public class Mapa {
    static void main() {
        HashMap<String, String> names =new HashMap<>();//el primer String define la clave el segundo String el tipo de dato

        var numbers = new HashMap<Integer, String>();

        //Tamaño
        System.out.println(names.size());

        //Añadir elemento
        names.put("Ana", "ana@gmail.com");
        names.put("Diego", "diego@gmail.com");
        names.put("Apellido1", "apellido@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        //Acceder a elementos
        //nota: se accede al elemento mediante la clave en este caso es "Andres"
        System.out.println(names.get("Ana"));

        //Verificar si existe elemento
        System.out.println(names.containsKey("Ana"));//si existe da true
        System.out.println(names.containsKey("dev"));//no existe da false

        System.out.println(names.containsValue("ana@gmail.com"));//verifica el valor de la clave si existe

        //Eliminar elemento
        System.out.println(names.remove("Apellido1"));//elimina clave y muestra el elemento asociado a la clave
        System.out.println(names);

        //Limpiar HashMap
        System.out.println("se va a eliminar el Map");
        names.clear();
        System.out.println(names);

        //Modificacion de elemento
        names.put("Ana", "ana@gmail.com");
        names.put("jorge", "jorge@gmail.com");
        System.out.println(names);

        names.put("jorge", "jorge1@gmail.com");//Esto modifica el valor de la clave ya que la clave existe
        System.out.println(names);

        //remplazar el valor si existe
        names.replace("Ana", "fer1@gmail.com");
        System.out.println(names);

        //insertar elemento solo si no existe
        names.putIfAbsent("Anaaa","ana2@gmail.com");//lo inserta porq Andress no existe
        System.out.println(names);
        //comprovar si el map esta basio
        System.out.println(names.isEmpty()); //devuelve true o false

        System.out.println(names.values());//devuelve los elementos de las claves






    }
}
