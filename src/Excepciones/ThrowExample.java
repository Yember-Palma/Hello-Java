package Excepciones;

public class ThrowExample {

    public void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Argumento equivocado");
        } else {
            System.out.println("mayor de edad");
        }
    }

    public void checkScore(int score) throws CustomException {
        if (score < 0 || score > 100) {
            throw new CustomException("la puntuacion debe estar enre 0 y 100");
        } else {
            System.out.println("Puntuacion valida: " + score);
        }

    }
}
