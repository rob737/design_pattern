package pattern.behavioural.visitor;

public class Driver {
    public static void main(String[] args) {
        HtmlDocument document = new HtmlDocument();
        HtmlDocument selectDocument = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        selectDocument.add(new AnchorNode());
        document.executeOperation(new HighlightOperation());
        selectDocument.executeOperation(new SelectOperation());
    }
}
