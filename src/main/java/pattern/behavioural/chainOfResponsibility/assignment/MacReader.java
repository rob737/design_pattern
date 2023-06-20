package pattern.behavioural.chainOfResponsibility.assignment;

public class MacReader extends DataReaderHandler{

    public MacReader(DataReaderHandler next) {
        super(next);
    }

    @Override
    public boolean doHandle(String filename) {
        System.out.println("Reading data from numbers spreadsheet.");
        return false;
    }
}
