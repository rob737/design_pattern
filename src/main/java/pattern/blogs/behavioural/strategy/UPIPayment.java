package pattern.blogs.behavioural.strategy;

public class UPIPayment implements PaymentStrategy{
    @Override
    public void pay(Double amount) {
        System.out.println("Paying bill of INR : " + amount + " via UPI.");
    }
}
