package pattern.blogs.behavioural.strategy;

public class Driver {
    public static void main(String[] args) {
        Double billAmount = 342.50;
        PaymentContext paymentContext = new PaymentContext();
        // At runtime, we are deciding the way to accept the payment.
        // In our use case, it is UPI payment.
        // Based on user selection, we can pass instance of other Payment option without modifying
        // any other classes.
        PaymentStrategy paymentStrategy = new UPIPayment();
        paymentContext.pay(billAmount, paymentStrategy);
    }
}
