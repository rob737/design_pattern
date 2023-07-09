package pattern.creational.builder.assignment;

public class TextExport implements ExportType{

    private final StringBuilder builder = new StringBuilder();

    @Override
    public void addElement(Element element) {
        if (element instanceof Text) {
            var text = ((Text)element).getContent();
            builder.append(text);
        }

    }

    @Override
    public String getElement() {
        return builder.toString();
    }

}
