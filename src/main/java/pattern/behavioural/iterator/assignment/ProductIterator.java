package pattern.behavioural.iterator.assignment;

public interface ProductIterator<T> {
    void next();
    T current();
    boolean hasNext();
}
