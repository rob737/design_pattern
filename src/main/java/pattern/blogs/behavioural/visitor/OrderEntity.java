package pattern.blogs.behavioural.visitor;

public class OrderEntity implements Entity{

    @Override
    public void execute(GarbageCollector collector) {
        collector.collect(this);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("OrderEntity{");
        sb.append(this.hashCode());
        sb.append('}');
        return sb.toString();
    }
}
