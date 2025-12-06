package FOR;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class BubleFor {
    static void main() {
        //For controlado por contador

        for (int i = 0; i < 5; i++){
            System.out.println("hola mundo");

        //int i = 0; esto es mi contador de inicializacio
        //i < 5 se repite el for hasta cuando i sea menor que
        // i++ se incrementa i   uno a uno
        }
        for (int i = 0; i < 5; i+=2) {
            System.out.println("hola mundo1");
        }
        for (int i = 5; i > 0; i--) {
            System.out.println("hola mundo2");
            //nota i-- funsiona como un controlador para q mi for finalise

        }
        //recorrer un Array con for
        String[] names = {"Diego", "Roberto", "Ana", "Juan", "Maria", "Fernanda"};

        for (int i = 0; i <4; i++){
            System.out.println(names[i]);
            //nota:esto permite recorrer el array definiendo hasta el elemento 4
            //lo cual es ineficiente ya que si el array cuenta con mas elementos
            //no podremos ver todo los elementos
        }
        for (int index = 0; index < names.length; index++){
            System.out.println(names[index]);
            //con este metodo recorremos todo los elementos del array
        }
        for (int index2 = 1; index2 < names.length +1; index2++){
            System.out.println(names[index2 -1]);
        //nota: si inicializamos en 1 nos va a mostrar desde el segundo elemento
        //el array ya el primer elemento del array se ubica en el indice 0
        //por lo tanto indicamos el -1 para igualar a cer e incrementamos +1
        //en length para mostrar el ultimo elemento
        }

        //bucle forEach para estructuras ArrayList HasMap y set
        String[] Frutas = {"uva", "manzana", "pera", "melon"};
        for (String Fruta:Frutas){
            System.out.println(Fruta);
        }
        //FOR CON SET

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);
        for (Integer number:numbers){
            System.out.println(number);
        }
        //FOR CON HASHMAP
        HashMap<String, Integer> emails= new HashMap();
        emails.put("Rocio", 12);
        emails.put("Kevin", 13);
        emails.put("Lorena", 14);
        emails.put("Oscar", 15);

        for (Map.Entry<String, Integer> email:emails.entrySet()){
            System.out.println(email);
        //nota:.entrySet es para convertir los pares en un set de elementos
        //para poder usarlos en for ....usamos Map.Entry es para representar
        //el tipo de variable del HasMap...<String, Integer> es para definir el
        //tipo de dato del hashMap

            //System.out.println(email.getKey());//para acceder solo a las claves del HashMap
            System.out.println(email.getValue());//se imprime solo el elemento
        }
        //Control de bucle while
        //- break
        for (String name:names){
            if (name.equals("juan")){
                break;
            }
            System.out.println(name);
        }
        //Continuar el bucle
        for (int i1 =0; i1 < 5; i1 ++ ){
            if (i1 == 3){
                continue;//fuerza la suiente ejecucion del bucle no ejecuta 3
            }
            System.out.println(i1);
        }


    }
}
