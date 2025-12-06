package LogicaProgramacion;

public class EjercisesOperators {
    static void main() {
        //Crea una variable con el resultado
        //de cada operacion aritmetica.
        float num=34;
        int num2=8;
        System.out.println("La suma de 34 y 8 es: " + (num+num2));
        System.out.println("la resta de 34 y 8 es: " + (num-num2));
        System.out.println("la multiplicacion de 34 y 8 es : " + (num*num2));
        System.out.println("La division de 34 y 8 es: " + (num/num2));
        System.out.println("el residuo de la division de 34 y 8 es: "+(num%num2));

        //Crea una variable para cada tipo de operacion de asignacion
        int operacion=10;
        operacion +=5;

        System.out.println(operacion);
        operacion -=3;
        System.out.println(operacion);
        operacion *=2;
        System.out.println(operacion);
        operacion /=4;
        System.out.println(operacion);
        operacion %=3;
        System.out.println(operacion);
        //Imprime 3 comparaciones verdaderas con
        // diferentes operadores de comparacion
        String carro="rojo";
        int precio=2100;
        System.out.println(carro=="rojo");
        System.out.println( precio>=100);
        System.out.println(precio==2100);

        //Imprima 3 ejemplos de uso de operadores unarios
        int num3=5;
        System.out.println(num3);
        System.out.println(+num3);
        System.out.println(-num3);

        int cou=10;
        System.out.println(+ cou);
        System.out.println(cou++);
        System.out.println(cou);
        System.out.println(++cou);
        System.out.println(cou);
        System.out.println(cou++);
        System.out.println(cou);
        System.out.println("eate es el \n decremento");
        System.out.println(cou);
        System.out.println(cou--);
        System.out.println(cou);
        System.out.println(cou--);
        System.out.println(--cou);
        System.out.println(cou);








    }


}
