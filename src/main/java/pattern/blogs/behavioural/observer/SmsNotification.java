package pattern.blogs.behavioural.observer;

public class SmsNotification implements DeliveryObserver{
    @Override
    public void receive(String orderId) {
        System.out.println("SMS notification triggered communicating status for order : " + orderId);
    }
}
