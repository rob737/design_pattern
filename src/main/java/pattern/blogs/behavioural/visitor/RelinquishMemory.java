package pattern.blogs.behavioural.visitor;

public class RelinquishMemory implements GarbageCollector{
    @Override
    public void collect(Entity entity) {
        System.out.println("Memory Relinquished for entity : " + entity);
    }
}
