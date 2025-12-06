package LogicaProgramacion;

public class Operators {
    static void main() {
        //Operadores Aritmeticos
        var a1=5;
        var b1=3;
        System.out.println(a1+b1);
        System.out.println(a1-b1);
        System.out.println(a1*b1);
        System.out.println(a1/b1);
        System.out.println(a1 % b1);//el modulo "%" es el reciduo de la divicion

        a1 = b1;
        System.out.println(a1);
        a1 = b1 *2;
        System.out.println(a1);

        //Operadores de asignacion directa
        a1 += 1;  //esto es una asignacion directa es igaul a (a1=a1+1)
        System.out.println(a1);
        a1 -= 1;
        System.out.println(a1);
        a1 += 2;
        System.out.println(a1);
        a1 /= 2;
        System.out.println(a1);
        a1 %= 2;

        //Operadores relacionales o comparacion

        System.out.println(a1 ==b1);
        System.out.println(a1 !=b1);
        System.out.println(a1 <=b1);
        System.out.println(a1 >=b1);
        System.out.println(a1 <b1);
        System.out.println(a1 >b1);

        //operadores de logicos
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false & false);

        System.out.println(2>5 || 2==2);
        System.out.println(2>5 && 2==2);
        System.out.println((2>5) && 2==2);






    }
}
