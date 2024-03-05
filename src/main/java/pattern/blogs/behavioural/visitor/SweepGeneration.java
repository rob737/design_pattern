package pattern.blogs.behavioural.visitor;

public class SweepGeneration implements GarbageCollector{
    @Override
    public void collect(Entity entity) {
        System.out.println(entity + " transitioned from one survivor generation to another.");
    }
}
