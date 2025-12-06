package Funciones;

import java.util.ArrayList;
import java.util.Arrays;

public class Functions {
    static void main() {

        for (int i = 0; i < 5; i++) {
            sendEmail();
        }

        sendEmailToUser("ana@gmail.com"); //acedemos a la funcion
        sendEmailToUser("ana@gmail.com", "ana");
        var users = new ArrayList<>(Arrays.asList("ana@gmail.com", "pedro@gmail.com")); //pasar parametros al arrays
        sendEmailToUser(users);
        //segunda forma de pasar parametros al arraysList
        //sendEmailToUser(new ArrayList<>(Arrays.asList("yember@gmail.com", "andres@gmail.com")));
        var seet = sendEmailWilthState("");
        System.out.println(seet);

    }


    public static void sendEmail() {
        System.out.println("enviar email");
    }
    public static void sendEmailToUser( String email) {
        System.out.println("enviar email: " + email);
    }
    public static void sendEmailToUser( String email, String name) {
        System.out.println("enviar email: " + email + " " + name);

    }
    public static void sendEmailToUser(ArrayList<String> emails) {
        for (String email1: emails) {
            System.out.println(email1);
        }
    }
    public static boolean sendEmailWilthState(String email) {
        if (email.isEmpty()) {
            System.out.println("email no enviado");
            return false;
        }
        System.out.println("se envia email a: " + email);
        return true;

    }

}