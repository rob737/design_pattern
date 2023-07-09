package pattern.creational.builder.assignment;

import pattern.creational.builder.assignment.html.HtmlDocument;
import pattern.creational.builder.assignment.html.HtmlImage;
import pattern.creational.builder.assignment.html.HtmlParagraph;

public class HtmlExport implements ExportType{

    HtmlDocument document = new HtmlDocument();

    @Override
    public void addElement(Element element) {
        if(element instanceof Text){
            var text = ((Text)element).getContent();
            document.add(new HtmlParagraph(text));
        }else if (element instanceof Image){
            var source = ((Image)element).getSource();
            document.add(new HtmlImage(source));
        }
    }

    @Override
    public String getElement() {
        return document.toString();
    }

}
