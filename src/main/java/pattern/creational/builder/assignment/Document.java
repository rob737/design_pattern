package pattern.creational.builder.assignment;



import pattern.creational.builder.assignment.html.HtmlDocument;
import pattern.creational.builder.assignment.html.HtmlImage;
import pattern.creational.builder.assignment.html.HtmlParagraph;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Document {
    private final List<Element> elements = new ArrayList<>();

    public void add(Element element) {
        elements.add(element);
    }

    public void export(ExportType exportType, String fileName) throws IOException {
        // integration.
        for(Element element : elements)
            exportType.addElement(element);
        String content = exportType.getElement();

        var writer = new FileWriter(fileName);
        writer.write(content);
        writer.close();
    }
}
