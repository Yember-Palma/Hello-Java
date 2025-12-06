package OOP;

public class Student {
    //Atributo
    int score;

    public void Calificacion() {
        if (score >=60) {
            System.out.println("si aprovo su nota es: " + score);
        }else {
            System.out.println("reprovado su nota es: " + score);
        }
    }
}
