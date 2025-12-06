package Polimorfismo;

public class NotificationPoli {
    //ejercicio 6 con funcion
    static void main() {
        senNotificationPoli(new EmailNotification1());
        senNotificationPoli(new SMSNotification1());
    }

    public void send1() {
        System.out.println("Enviando Notificacion");

    }
    public static class EmailNotification1 extends NotificationPoli {
        @Override
        public void send1() {
            System.out.println("Enviando Notificacion por Email");
        }


    }
    public static class SMSNotification1 extends NotificationPoli {
        public void send1() {
            System.out.println("Enviando Notificacion por SMS");
        }

    }
    public static void senNotificationPoli(NotificationPoli notification1) {
        notification1.send1();

    }
}
