package LogicaProgramacion;

public class Conditionals {

    static void main() {
        //Condicionales
        var age=18;
        if (age>18){
            System.out.println("el usuario es mayor de edad");
        } else if (age==18) {
            System.out.println("tiene 18");

        } else {
            System.out.println("menor de edad");
        }
//condicional switch
        var day =6;
        switch (day){
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            default:
                System.out.println("no es ni lunes,  marte, ni miercoles");
        }






    }

}
