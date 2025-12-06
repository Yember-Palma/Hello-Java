package LogicaProgramacion;

public class StringEjerxices

{


    static void main() {
        //Concadena dos cadenas de texto
        String name="Jorge";
        var apellido=new String(" Apellido1 ");
        System.out.println(name.concat(apellido));

        //Muestra la longitud de una cadena de texto
        System.out.println(name.length());
        //Muestra el primer y ultimo caracter de un String
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length()-1));
        //convierte a mayuscula y minuscula un String
        //mayuscula
        System.out.println(name.toUpperCase());
        //minuscula
        System.out.println(apellido.toLowerCase());

        //Comprueba si una cadena de texto contiene una palabra concreta
        System.out.println(name.contains("res"));
        //Formate un estrin con un entero
        System.out.println(String.format("hola tu nombre es %s y tu apellido es %s", name, apellido));


        //elimina los espacios en blanco al principio y al final
        System.out.println(apellido.trim());

        //sustituye todo los espacios en blanco de un String por un guion

        System.out.println(apellido.replace(" ", "-"));

        //Compruebe si dos String son iguales
        System.out.println(apellido.equals(name));
        //Comprueve si dos string tienen la misma longitug
        System.out.println(apellido.length()==name.length());


    }
}
