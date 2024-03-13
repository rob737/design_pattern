package pattern.behavioural.observer.assignment;

public class Stock extends Observable{
    private final String symbol;
    private float price;

    public Stock(String symbol, float price) {
        this.symbol = symbol;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        notifySubscribers();
    }


    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", price=" + price +
                '}';
    }
}
