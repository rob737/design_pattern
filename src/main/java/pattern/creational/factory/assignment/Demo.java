package pattern.creational.factory.assignment;

public class Demo {
    public static void show() {
        var scheduler = new ArabianScheduler();
        scheduler.schedule(new Event());
    }
}
