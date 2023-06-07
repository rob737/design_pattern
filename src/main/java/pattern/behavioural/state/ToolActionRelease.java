package pattern.behavioural.state;

/*
* Instead of interface (my solution), alternative was to use abstract class but since we don't have to
provide any common method to all the underlying classes so we didn't use it.
* */
public interface ToolActionRelease {
    void performOnMouseRelease();
}
