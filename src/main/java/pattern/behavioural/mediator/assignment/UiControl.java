package pattern.behavioural.mediator.assignment;

import java.util.ArrayList;
import java.util.List;

public class UiControl {
    private final List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler eventHandler){
        eventHandlers.add(eventHandler);
    }

    protected void notifyHandlers(){
        for(EventHandler handler : eventHandlers)
            handler.execute();
    }
}
