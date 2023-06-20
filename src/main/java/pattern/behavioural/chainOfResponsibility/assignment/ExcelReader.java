package pattern.behavioural.chainOfResponsibility.assignment;

public class ExcelReader extends DataReaderHandler{

    public ExcelReader(DataReaderHandler next) {
        super(next);
    }

    @Override
    public boolean doHandle(String filename) {
        System.out.println(this);
        System.out.println("Reading data from and excel spreadsheet.");
        return false;
    }
}
