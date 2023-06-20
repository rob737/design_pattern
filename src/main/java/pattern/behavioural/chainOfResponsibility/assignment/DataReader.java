package pattern.behavioural.chainOfResponsibility.assignment;

public class DataReader {
    private final DataReaderHandler dataReaderHandler;

    public DataReader(DataReaderHandler dataReaderHandler) {
        this.dataReaderHandler = dataReaderHandler;
    }

    public void read(String filename){
        this.dataReaderHandler.handle(filename);
    }
}
