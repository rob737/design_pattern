package pattern.blogs.behavioural.observer;

public class DeliveryPartner extends  DeliveryObservable{
    private final String partnerId;

    public DeliveryPartner(String partnerId) {
        this.partnerId = partnerId;
    }

    public void updateOrderStatus(String orderId){
        System.out.println("Partner : " + partnerId + " has updated delivery status for order " + orderId);
        notifySubscribers(orderId);
    }

}
