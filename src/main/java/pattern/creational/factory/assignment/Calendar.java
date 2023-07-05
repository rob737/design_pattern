package pattern.creational.factory.assignment;

import java.util.Date;

public class Calendar implements WorldCalendar{
    @Override
    public void addEvent(Event event, Date date) {
        System.out.println("Adding an event on the given date.");
    }
}
