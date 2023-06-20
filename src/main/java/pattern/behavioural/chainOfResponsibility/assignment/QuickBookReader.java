package pattern.behavioural.chainOfResponsibility.assignment;

public class QuickBookReader extends DataReaderHandler {

    public QuickBookReader(DataReaderHandler next) {
        super(next);
    }

    @Override
    public boolean doHandle(String filename) {
        System.out.println("Reading data from a QuickBooks file.");
        return false;
    }
}
