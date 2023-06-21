package pattern.behavioural.visitor;

public class HeadingNode implements HtmlNode{
    @Override
    public void highlight() {
        System.out.println("Highlight headings.");
    }
}
