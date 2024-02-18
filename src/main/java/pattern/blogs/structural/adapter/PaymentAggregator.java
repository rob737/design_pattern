package pattern.blogs.structural.adapter;

public interface PaymentAggregator {
    void pay(String recipientId, Double amount);
}
