package pattern.structural.facade;

public class Demo {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        // Using facade pattern, we can use this service wherever we need to send notification from.
        notificationService.send("facade pattern", "127.0.0.1");
    }
}
