package pattern.creational.factory.assignment;

import java.util.Date;

public class ArabianScheduler extends Scheduler{

    @Override
    protected WorldCalendar getCalendar() {
        return new WorldCalendar() {
            @Override
            public void addEvent(Event event, Date date) {
                System.out.println("Added event to Anonymous inner class.");
            }
        };
    }
}
