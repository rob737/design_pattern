package pattern.behavioural.iterator;

public interface iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
