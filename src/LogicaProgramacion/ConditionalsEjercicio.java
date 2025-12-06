package LogicaProgramacion;

public class ConditionalsEjercicio {

    static void main() {
        //establece la edad de un usuario y muestra si puede votar(mayor o igual a 18).


        int UsuarioEdad=18;
        if (UsuarioEdad>18){
            System.out.println(String.format("el usuario tiene %d años puede votar",UsuarioEdad));
        } else if (UsuarioEdad==18) {
            System.out.println(String.format("Tiene %d puede votar", UsuarioEdad));
        }else{
            System.out.println(String.format("El usuario tiene %d años es menor de edad no puede votar", UsuarioEdad));
        }

        //Declara dos numeros y muestra cual es mayor o si son iguales

        var num=11;
        var num2=15;
        if (num>num2){
            System.out.println(String.format("entre %d y %d el primer numero es mayor",num,num2));
        } else if (num==num2) {
            System.out.println(String.format("entre %d y %d los numeros son iguales", num,num2));
        }else {
            System.out.println(String.format("entres %d y %d el segundo numero es mayor",num,num2));
        }
        //Dado un numero, verifica si es positivo, negativo o cero
        var numero=-25;
        if (numero>=1){
            System.out.println(String.format("El numero %d es positivo", numero));
        } else if (numero==0) {
            System.out.println(String.format("el numero %d es cero", numero));
        }else {
            System.out.println(String.format("el numero %d es negativo", numero));
        }

        //Crea un programa que diga si un numero es par o impar

        int numero2=35;
        if (numero2 % 2==0){
            System.out.println("es par");
        }else {
            System.out.println("es impar");
        }

        //verifica si un numero esta en el rango del uno al 100
        int NumeroVerificar=565;

        if (NumeroVerificar>=1 && NumeroVerificar<=100){
            System.out.println(String.format("El numero %d esta en el rango del 1 al 100",NumeroVerificar));
        }else {
            System.out.println(String.format("El numero %d no esta en el rango del 1 al 100",NumeroVerificar));
        }
        // declara una variable con el dia de la semana (1-7) y muestra su nombre con swtch

        var day=5;
        switch (day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("la semana solo tiene 7 dias");
        }
        //simula un sistema de notas : nuestra "sobresaliente", "aprovado" o "reprovado"
        //segun la nota (0-20)
        var nota=14;
        if (nota>=18 && nota<=20){
            System.out.println("sobresaliente");
        } else if (nota>=15 && nota<=17){
            System.out.println("aprovado");
        } else if (nota>=0 && nota<=14) {
            System.out.println("reprovo");
        }else {
            System.out.println("ingrese un numero correcto");
        }
        //escribe un programa que determine si puedes entrar el cine:
        // debes tener al menos 15 años o ir acompañado

        int EdadUsuario=25;
        boolean Acompañado=false;
        if (EdadUsuario>=15 || Acompañado){
            System.out.println("puede ingresar");
        }else {
            System.out.println("no puede pasar");
        }

        //Crea un programa que diga si una letra es vocal o consonante
        char letter = 'a';
        char lowerLetter = Character.toLowerCase(letter);

        if (lowerLetter == 'a' || lowerLetter == 'e' || lowerLetter == 'i' ||
                lowerLetter == 'o' || lowerLetter == 'u') {
            System.out.println("La letra '" + letter + "' es una vocal");
        } else if (Character.isLetter(lowerLetter)) {
            System.out.println("La letra '" + letter + "' es una consonante");
        } else {
            System.out.println("'" + letter + "' no es una letra valida");
        }

        //Usa 3 variables a,b,c y muestra cual es el mayor de las letras
        int a=3;
        int b=5;
        int c=8;
         if (a>= b && a >=c){
             System.out.println("a es mayor");
         } else if (b>=a && b>=c) {
             System.out.println("b es mayor");

         }else {
             System.out.println("c es mayor");
         }



    }

}
