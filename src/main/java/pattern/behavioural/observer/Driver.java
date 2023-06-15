package pattern.behavioural.observer;

public class Driver {
    public static void main(String[] args) {
        DataSource source = new DataSource();
        SpreadSheet sheetOne = new SpreadSheet(source);
        SpreadSheet sheetTwo = new SpreadSheet(source);
        Chart chart = new Chart(source);
        source.addSubscriber(sheetOne);
        source.addSubscriber(sheetTwo);
        source.addSubscriber(chart);
        source.setValue(10);
    }
}
