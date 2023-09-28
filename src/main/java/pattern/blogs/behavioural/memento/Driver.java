package pattern.blogs.behavioural.memento;

public class Driver {
    public static void main(String[] args) {
        // Scope of the task is to populate a field which can be reverted as well.
        CheckIn checkIn = new CheckIn();

        checkIn.checkInChanges("Implementation of User Authentication.");
        checkIn.checkInChanges("Completed DB modelling");

        // Validate the current value of content..
        System.out.println(checkIn.getContent());

        checkIn.revert();

        // Validate the value of content after reverting it once.
        System.out.println(checkIn.getContent());
    }
}
