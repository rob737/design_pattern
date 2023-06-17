package pattern.behavioural.observer.assignment;

import java.util.ArrayList;
import java.util.List;

public class StatusBar implements Observer {
    private final List<Stock> stocks = new ArrayList<>();
    private final Stock stock;

    public StatusBar(Stock stock) {
        this.stock = stock;
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void show() {
        for (var stock : stocks)
            System.out.println(stock);
    }

    @Override
    public void communicate() {
        System.out.println("Changed price : " + this.stock.getPrice());
    }
}

