package pattern.creational.builder.assignment.html;

public class HtmlParagraph extends HtmlElement {
    private final String text;

    public HtmlParagraph(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("<p>%s</p>", text);
    }
}
