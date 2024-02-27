package pattern.blogs.structural.flyweight;

public class PaymentService {
    private final PaymentFactory paymentFactory;

    public PaymentService(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }

    public CurrencyExchange getExchangeFactor(String exchangeKey){
       return paymentFactory.getCurrencyExchange(exchangeKey);
    }


}
