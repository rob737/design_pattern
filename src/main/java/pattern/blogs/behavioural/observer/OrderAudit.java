package pattern.blogs.behavioural.observer;

public class OrderAudit implements DeliveryObserver{
    @Override
    public void receive(String orderId) {
        System.out.println("Order status updated in system for " + orderId);
    }
}
