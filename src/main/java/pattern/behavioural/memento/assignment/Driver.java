package pattern.behavioural.memento.assignment;

public class Driver {
    public static void main(String[] args) {
        Document document = new Document();
        DocumentHistory documentHistory = new DocumentHistory();

        document.setContent("memento content");
        document.setFontName("IND");
        document.setFontSize(23);

        documentHistory.push(document.createState());
        document.setFontName("KEN");
        documentHistory.push(document.createState());
        document.setContent("Practical use case");
        documentHistory.push(document.createState());
        System.out.println(document);
        System.out.println("Undo operations ...");
        document.undo(documentHistory.pop());
        System.out.println(document);
        document.undo(documentHistory.pop());
        System.out.println(document);
    }
}
