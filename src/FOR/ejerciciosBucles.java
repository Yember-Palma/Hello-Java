package FOR;

import java.awt.*;
import java.util.*;

public class ejerciciosBucles {
    static void main() {
        //escribir un programaque repita 10 veces una palabra
        String palabra ="holaMundo";
        for (int i=0; i<10; i++){
            System.out.println(palabra);
        }

        //Escribir un programa que pregunte al usuario su edad
        // y muestre por pantalla todos los años que a cumplido(desde 1 hasta su edad9
        int edad =27;
        for (int i =0; i<=edad; i ++ ) {
            if (i % 2 == 0) {
            } else {
                System.out.print(i + ",");//print imprime todo en una sola linea
            }
        }

        //Escribir un programa que pida al usuario un numero entero positivo
        //y muestra por pantalla la cuenta atras desde ese numero hasta cero
        //ceparados por comas
        System.out.println("\ncuenta regresiva");

        int numero=17;
        for (int index=numero;index>=0; index--){
            System.out.print(index + ",");
        }

        //Imprimir los numeros del 1 al 10 usando while
        int i2=0;
        while (i2<=10){
            System.out.println(i2);
            i2++;
        }
        //Usa do-while para mostrar todos los valores de un ArrayList

        ArrayList<String> names= new ArrayList();
        names.add("pedro");
        names.add("juan");
        names.add("lorenzo");
        names.add("oscar");
        names.add("diego");

        i2=0;
        do {
            System.out.println(names.get(i2));
            i2++;

        }while (i2 < names.size());

        //imprime los multiplos de 5 del 1 al 50 usando for

        int multiplo=1;
        for (multiplo=1; multiplo<=50; multiplo++){
            if (multiplo % 5 == 0){
                System.out.println("es multiplo de 5: " + multiplo);
            }

        }
        //recorre un array de 5 numeros  e imprime la suma total
        Integer[] numbers1 ={5,8,9,7,4};
        int sum=0;
        for (int i3 = 0 ;i3 < numbers1.length ;i3++){
            sum +=numbers1[i3];
            System.out.println("el numero" + (i3 + 1) + ": "+ numbers1[i3]);
            }
        System.out.println("suma total:" + sum);



        //Usa un for para recorrer un Array y mostrar sus valores
        String[] nombre={"pedro", "juan", "leonel", "diego"};
        for (int i8=0; i8 < nombre.length; i8++){
            System.out.println("el nombre " + (i8 +1) + ": " + nombre[i8]);
        }
        //Usa for-each para recorrer un HashSet y un HashMap
        HashSet<Integer> clave=new HashSet();
        HashMap<String,Integer> usuarios = new HashMap();
        clave.add(2345);
        clave.add(4321);
        clave.add(9876);

        usuarios.put("jorge", 99999999);
        usuarios.put("juan", 777777777);
        usuarios.put("diego", 988888888);

        for (Integer claves:clave){
            System.out.println(claves);
        }
        for (Map.Entry<String, Integer> usuario:usuarios.entrySet()){
            System.out.println(usuario);
        }

        //Imprime los numeros del 10 al 1 (desendiente) con bucle for

        for ( int i6=10; i6 > 0;i6 --){
            System.out.println(i6);
        }
        System.out.println("numeros multiplos de 3");
        //Usa continue para saltar los multiplos de 3 del 1 al 20.
        for (int i4=0; i4<20; i4 ++){
            if (!(i4 % 3==0)){
                continue;
            }
        System.out.println(i4);
        }
        //Usa break para detener un bucle cuando encuentres
        //un numero negativo en un Array
        Integer[] negativos={8,9,12,46,-13,49};
        for (Integer negativo:negativos) {
            System.out.println("verificandondo numeros: " + negativo);
            if (negativo<0) {
                System.out.println("se encontro un numero negativo: " + negativo);
                System.out.println("Deteniendo el bucle");
                break;
            }
            }
        //for (int i5=0; i5< negativos.length; i5++){
          //  System.out.println("verificando numero: " + negativos[i5]);
         //   if (negativos[i5] <0){
         //       System.out.println("numero negativo encontrado: " + negativos[i5] + "!");
         //       System.out.println("deteniendo el bucle");
         //       break;
           // }
       // }
        //Crea un programa que calcule el factorial de un numero dado
        int NumFactorial =20;
        long factorial=1;
        System.out.println("calcular el numero factorial de " + NumFactorial + ": ");
        for (int i7=1; i7 <= NumFactorial; i7++){
            factorial *=i7;
            System.out.println(i7 +  "! = " + factorial);
            }
        System.out.println("el factorial de " + NumFactorial + "es: " + factorial);












    }
}
