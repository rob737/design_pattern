package pattern.blogs.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PaymentFactory {
    private final Map<String, CurrencyExchange> currencyExchangeCache = new HashMap<>();


    public CurrencyExchange getCurrencyExchange(String key){
        if(currencyExchangeCache.get(key) != null)
            return currencyExchangeCache.get(key);
        String[] currencies = key.split(":");
        return new CurrencyExchange(currencies[0],currencies[1]);
    }
}
