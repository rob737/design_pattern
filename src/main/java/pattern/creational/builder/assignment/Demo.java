package pattern.creational.builder.assignment;

import java.io.IOException;

public class Demo {
    public static void show() throws IOException {
        var document = new Document();
        document.add(new Text("Hello World"));
        document.add(new Image("pic1.jpg"));

        document.export(new HtmlExport(), "export_assignment.html");

        // Only writes the text elements to the file
        document.export(new TextExport(), "export_assignment.txt");
    }
}
