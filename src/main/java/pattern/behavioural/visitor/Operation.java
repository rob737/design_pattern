package pattern.behavioural.visitor;

/*
* One of the limitation of visitor pattern is that object relationships and structure
* must barely change to take full advantage of this pattern otherwise we won't be able
* to adhere to Open-Closed Principle.
* e.g. let's say tomorrow we introduce a new element that implements HtmlNode then we would need to
* support operation on that new entity as well so we would need to modify Operation interface
* and overload apply method with new entity.
* */

public interface Operation {
    void apply(HeadingNode headingNode);
    void apply(AnchorNode anchorNode);
}
