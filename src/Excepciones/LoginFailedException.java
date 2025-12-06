package Excepciones;

public class LoginFailedException extends IllegalArgumentException{
    public LoginFailedException(String message) {
        super(message);

    }

}
