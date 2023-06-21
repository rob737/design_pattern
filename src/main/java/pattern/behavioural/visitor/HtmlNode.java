package pattern.behavioural.visitor;

/*
* Now, let's say we need to add a new method to retrieve contents in Plain text then we would need
* to change object structure of all classes that have implemented HtmlNode interface.
* Thus, violating Open-Closed Principle.
* Also, logic for highlight method is spread over different classes which is redundant as
* highlight would have the same behaviour across all classes.
* Visitor pattern can be used to mitigate above issues.
* */
public interface HtmlNode {
    void execute(Operation operation);
}
