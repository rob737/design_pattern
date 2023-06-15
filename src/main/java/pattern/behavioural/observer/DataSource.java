package pattern.behavioural.observer;

public class DataSource extends Observable {
    private int value;

    // Pull style of communication is when concrete Observers fetch data from concrete source.
    // We can leverage getValue() method for implementing pull style communication.
    // This is more flexible as we can provide multiple types of data source and
    // instead of pushing one presumed data type, we can let observer to
    // pull data as per the need.
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        // Push style of communication is if we pass value as well to notifySubscribers method.
        notifySubscribers();
    }
}
