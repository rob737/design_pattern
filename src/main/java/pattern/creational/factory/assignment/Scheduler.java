package pattern.creational.factory.assignment;

import java.util.Date;

public class Scheduler {

    public void schedule(Event event) {
        var today = new Date();
        WorldCalendar calendar = getCalendar();
        calendar.addEvent(event, today);
    }

    protected WorldCalendar getCalendar(){
        return new Calendar();
    }
}
