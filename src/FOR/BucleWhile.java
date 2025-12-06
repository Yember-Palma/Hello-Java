package FOR;

public class BucleWhile {
    static void main() {
        //Bucle While se repite mientras la condicion sea verdadera
        int index=0;
        while (index < 5){
            System.out.println("bucle while");
            index ++;//incrementa el bucle para q finalice
        //nota: el while se le indica la condicion index < 5 se ejecuta el bucle
        //int index es la inicializacion en cero
        //index ++ se incrementa index para finalizar bucle
        }

        //Imprimir array con WHILE
        String[] names = {"Simon","jorge", "pedro", "juan"};
        int i =0;
        while (i < names.length){
            System.out.println(names[i]);//para imprimir el valor del arrays
            i ++;
        }

        // EJECUTAR HASTA CUANDO SE ENCUENTRE El NOMBRE Andres
        i=0;
        while (i < names.length){
            System.out.println(names[i]);
            if (names[i].equals("jorge")){
                i +=1;
            }
            i++;
        }
        i=0;
        boolean find=false;
        while (!find){
            System.out.println(names[i]);
            if (names[i].equals("pedro")){
                System.out.println("Encontramos a pedro");
                find=true;

            }
            i++;
        }


        //- do-while se ejecuta siempre una vez
        index=0;
        do {
            System.out.println("hola mundo otra vez");
            index++;

        } while (index < 0);






    }
}
