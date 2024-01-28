package pattern.creational.factory.assignment;

import java.util.Date;

public class Scheduler {

    public void schedule(Event event) { // similar to operation method as per notes.
        var today = new Date();
        WorldCalendar calendar = getCalendar();
        calendar.addEvent(event, today);
    }

    protected WorldCalendar getCalendar(){ // similar to factoryMethod method as per notes.
        return new Calendar();
    }
}
