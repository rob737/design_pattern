package pattern.behavioural.chainOfResponsibility.assignment;

public abstract class DataReaderHandler {
    private final DataReaderHandler next;

    protected DataReaderHandler(DataReaderHandler next) {
        this.next = next;
    }

    public void handle(String filename){
        if(doHandle(filename))
            return;

        if(next!=null)
            next.handle(filename);
    }

    public abstract boolean doHandle(String filename);
}
