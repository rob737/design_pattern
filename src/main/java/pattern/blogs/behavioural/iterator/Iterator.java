package pattern.blogs.behavioural.iterator;

public interface Iterator <T> {
     boolean hasNext();
     void next();
     T current();
}
