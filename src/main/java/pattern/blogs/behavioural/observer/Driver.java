package pattern.blogs.behavioural.observer;

public class Driver {
    public static void main(String[] args) {
        DeliveryPartner deliveryPartner = new DeliveryPartner("UBS:2345");
        deliveryPartner.addSubscribers(new OrderAudit());
        deliveryPartner.addSubscribers(new SmsNotification());

        deliveryPartner.updateOrderStatus("AWXTR");
        deliveryPartner.updateOrderStatus("SEDFG");
    }
}
