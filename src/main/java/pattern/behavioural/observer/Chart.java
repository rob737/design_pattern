package pattern.behavioural.observer;

public class Chart implements Observer {
    private final DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void receive() {
        System.out.println("Chart : Data received : " + dataSource.getValue());
    }
}
