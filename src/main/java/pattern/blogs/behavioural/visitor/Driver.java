package pattern.blogs.behavioural.visitor;

public class Driver {
    public static void main(String[] args) {
        Entity entity = new OrderEntity();
        GarbageCollector markSweep = new MarkSweep();
        GarbageCollector sweepGeneration = new SweepGeneration();
        GarbageCollector relinquishMemory = new RelinquishMemory();

        // Perform GC operation on Order Entity.
        entity.execute(markSweep);
        entity.execute(sweepGeneration);
        entity.execute(relinquishMemory);
    }
}
