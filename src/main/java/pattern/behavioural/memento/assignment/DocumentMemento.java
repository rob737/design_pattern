package pattern.behavioural.memento.assignment;

public class DocumentMemento {
    private Document state;

    public DocumentMemento createState(Document state){
        this.state = state;
        return this;
    }

    public Document getState(){
        return state;
    }
}
