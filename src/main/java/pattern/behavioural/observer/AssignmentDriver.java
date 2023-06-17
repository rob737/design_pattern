package pattern.behavioural.observer;

import pattern.behavioural.observer.assignment.Observer;
import pattern.behavioural.observer.assignment.StatusBar;
import pattern.behavioural.observer.assignment.Stock;
import pattern.behavioural.observer.assignment.StockListView;

public class AssignmentDriver {
    public static void main(String[] args) {
        Stock stock = new Stock("$",40);
        pattern.behavioural.observer.assignment.Observer statusBar = new StatusBar(stock);
        Observer stockListView = new StockListView(stock);

        stock.addSubscriber(statusBar);
        stock.addSubscriber(stockListView);
        stock.setPrice(50);
    }
}
