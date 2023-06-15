package pattern.behavioural.observer;

public class SpreadSheet implements Observer {
    private final DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void receive() {
        System.out.println("Spreadsheet : Data received : " + dataSource.getValue());
    }
}
