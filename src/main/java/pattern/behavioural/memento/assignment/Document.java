package pattern.behavioural.memento.assignment;

public class Document {
    private String content;
    private String fontName;
    private int fontSize;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public DocumentMemento createState(){
        Document document = new Document();
        document.fontName = this.fontName;
        document.fontSize = this.fontSize;
        document.content = this.content;
        return new DocumentMemento().createState(document);
    }

    public void undo(DocumentMemento documentMemento){
       Document doc =  documentMemento.getState();
       this.setFontName(doc.getFontName());
       this.setFontSize(doc.getFontSize());
       this.setContent(doc.getContent());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Document{");
        sb.append("content='").append(content).append('\'');
        sb.append(", fontName='").append(fontName).append('\'');
        sb.append(", fontSize=").append(fontSize);
        sb.append('}');
        return sb.toString();
    }
}
