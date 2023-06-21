package pattern.behavioural.visitor;

/*
* Including new operation is super extensible like this.
* */
public class SelectOperation implements Operation{
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("Selected - " + headingNode);
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("Selected - " + anchorNode);
    }
}
