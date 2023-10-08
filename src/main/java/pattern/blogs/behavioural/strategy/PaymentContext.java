package pattern.blogs.behavioural.strategy;

public class PaymentContext {

    public void pay(Double paymentAmount, PaymentStrategy paymentStrategy){
        paymentStrategy.pay(paymentAmount);
    }

}
