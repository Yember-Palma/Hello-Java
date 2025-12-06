package LogicaProgramacion;

public class CadenaDeTexto {

    static void main() {

        //cadena de texto
        String name="Fernando";
        String name1="";
        var apellido=new String( "Apellido1");

        //Operaciones basicas para manejar String
        System.out.println(name +" "+ apellido);
        //metod length conteo de letras del string
        System.out.println(name.length());

        //obtener caracter
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(name.length() -1));//nota:para saber cuanto
        //caracteres hay en el String
        //subcadena Conctenacion de cadenas
        System.out.println(apellido.substring(0));
        System.out.println(apellido.substring(0,4));

        //transforma minuscula y mayuscula
        System.out.println(apellido.toUpperCase());//convertir a Mayuscula el String
        System.out.println(apellido.toLowerCase());//COnvertir a minuscula el String
        System.out.println(name1.isEmpty()); //verifica si el string esta basio
        System.out.println(name.charAt(2)); // devuelve el caracter en la posicion especifica


        //comparar cadenas
        System.out.println(name.equalsIgnoreCase("palma"));//compara el contenido ignorando mayuscula y minuscula
        System.out.println(apellido.startsWith("apell"));// verifica si la cadena comienza con el prefijo dado
        System.out.println(apellido.endsWith("ido"));//verifica si la cadena termina en el sufijo dado
        System.out.println(apellido.contains("lli"));//verifica si la cadena tiene la secuencia de caracteres especificos
        System.out.println(apellido.indexOf("Ap"));//devuelve el indice de la primera ocurrencia de
        // la cadena si no existe el caracter devuelve un -1
        System.out.println(name.equals("Fer"));//comparar dos cadenas de texto
        System.out.println(name.equalsIgnoreCase("fer"));//comparar dos cadenas de texto e imnorar mayusculas y minuscula

        //diferencias entre == y equals
        System.out.println("diferencia entre == y equals");
        var a="DIEGO";
        var b="DIEGO";
        var c=new String("DIEGO");
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a.equals(c));

        //Manipulacion y modificacion de un String

        System.out.println(apellido.concat(name));//metodo para unir cadenas o variables
        System.out.println(apellido.concat(name).replace('a','e')); //este metodo sirve para reemplazar un caracter

        System.out.println(apellido.trim());//elimina los espacios iniciales y finales

        //Insertar valores en la cadena de texto con .format
        int edad=25;
        int nacimiento=2000;
        System.out.println(String.format("hola, mi nombre es %s, tengo %d años, naci en %d", name,edad,nacimiento));//formateo de texto


        String data= "123abc456";
        System.out.println(data.replaceFirst("[a-z]", "-"));











    }
}
