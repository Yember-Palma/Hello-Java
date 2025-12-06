package Modulo1Master;

public class ProgramacionImperactiva {
    static void main() {
        int suma8 = 0;
        int[] numeros = {1, 2, 3, 4};
        for (int n: numeros) {
            if (n % 2 == 0)
                suma8 += n;
            System.out.println("la suma es " + suma8);
        }

    }
}
