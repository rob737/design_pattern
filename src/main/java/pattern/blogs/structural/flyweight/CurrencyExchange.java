package pattern.blogs.structural.flyweight;

public class CurrencyExchange {

    private final String sourceCurrency;
    private final String targetCurrency;

    public CurrencyExchange(String sourceCurrency, String targetCurrency) {
        this.sourceCurrency = sourceCurrency;
        this.targetCurrency = targetCurrency;
    }

    public double getExchangeFactor(){
        // Assumption : Conversion logic from one currency to another.
        double exchangeFactor = 2.6;
        System.out.printf("Exchange factor between %s %s is %s \n", sourceCurrency, targetCurrency, exchangeFactor);
        return exchangeFactor;
    }
}
