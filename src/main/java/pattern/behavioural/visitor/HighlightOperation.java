package pattern.behavioural.visitor;

public class HighlightOperation implements Operation{
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("Highlighted - " + headingNode);
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("Highlighted - " + anchorNode);
    }
}
