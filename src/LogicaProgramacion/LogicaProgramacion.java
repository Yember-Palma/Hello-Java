package LogicaProgramacion;

public class LogicaProgramacion {
    static void main() {
        int base=10;
        int altura=5;

        int area=base*altura;

        System.out.println("la base es:" + base);
        System.out.println("la altura es: " + altura);
        System.out.println("la area es:" + area);


        //ejemplo 2
        int compras = 99;
        double descuento = 0;
        if (compras > 100){
            descuento = compras * 0.10;

        }else {
            descuento = 0;
            System.out.println("no aplica descuento");
        }
        double total=compras - descuento;
        System.out.println(total);

        //ejemplo 3
        for (int i =0; i <=10; i++){
            if (i % 2 ==0){
                System.out.println("es par: " + i);
            }
        }

    }
}
