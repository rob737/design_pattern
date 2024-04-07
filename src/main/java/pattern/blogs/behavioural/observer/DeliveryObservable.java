package pattern.blogs.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class DeliveryObservable {
    private final List<DeliveryObserver> deliveryObservables = new ArrayList<>();

    public void addSubscribers(DeliveryObserver deliveryObserver){
        deliveryObservables.add(deliveryObserver);
    }

    public void notifySubscribers(String orderId){
        for(DeliveryObserver deliveryObserver : deliveryObservables)
            deliveryObserver.receive(orderId);
    }
}
