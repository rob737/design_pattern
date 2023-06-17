package pattern.behavioural.observer.assignment;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private final List<Observer> subscribers = new ArrayList<>();

    public void addSubscriber(Observer subscriber){
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Observer subscriber){
        subscribers.remove(subscriber);
    }

    protected void notifySubscribers(){
        for(Observer observer : subscribers)
            observer.communicate();
    }
}
