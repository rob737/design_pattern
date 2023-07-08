package pattern.creational.builder;

public class Driver {
    public static void main(String[] args) {
        Presentation presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));

        PdfDocumentBuilder builder = new PdfDocumentBuilder();
        presentation.export(builder);
        builder.getPdfDocument();
    }
}
