package LogicaProgramacion;

public class PruebasOperadores {
    static void main() {
        int c=8;
        int d=10;

        System.out.println(c==d);
        System.out.println(d>c);
        System.out.println(c<d);
        System.out.println(c != d);


        System.out.println(c<d && d>c );
        System.out.println(d<c || c>d);

        System.out.println(!(c<d) || d<c);

    }


}
