package LogicaProgramacion;

public class Cupon {
    static void main() {
        int cupon=2345;
        Integer[] Base_Cupon={1235,6987,2415,2345};
            for (  int i=0; i < Base_Cupon.length; i++) {
                System.out.println("cupon existente: " + Base_Cupon[i]);
                if (Base_Cupon[i].equals(cupon)){
                    System.out.println("su cupon es valido");
                    break;
                }
        }



    }
}
