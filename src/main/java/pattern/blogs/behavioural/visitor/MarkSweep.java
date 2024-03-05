package pattern.blogs.behavioural.visitor;

public class MarkSweep implements GarbageCollector{

    @Override
    public void collect(Entity entity) {
        System.out.println(entity + " marked for GC collection.");
    }
}
