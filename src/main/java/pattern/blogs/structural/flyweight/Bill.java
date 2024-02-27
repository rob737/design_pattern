package pattern.blogs.structural.flyweight;

public class Bill {
    private final CurrencyExchange currencyExchange;
    private final double amount;

    public Bill(CurrencyExchange currencyExchange, double amount) {
        this.currencyExchange = currencyExchange;
        this.amount = amount;
    }

    public void transferMoney(){
        double exchangeFactor = currencyExchange.getExchangeFactor();
        System.out.printf("Amount : %s transferred with exchange factor %s \n", amount, exchangeFactor);
    }
}
