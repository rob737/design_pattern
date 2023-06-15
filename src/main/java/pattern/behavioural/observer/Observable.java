package pattern.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private final List<Observer> observers = new ArrayList<>();

    public void addSubscriber(Observer observer){
            observers.add(observer);
    }

    public void removeSubscriber(Observer observer){
        observers.remove(observer);
    }

    public void notifySubscribers(){
        for(Observer observer : observers)
            observer.receive();
    }
}
