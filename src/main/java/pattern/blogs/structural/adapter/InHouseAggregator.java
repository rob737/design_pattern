package pattern.blogs.structural.adapter;

public class InHouseAggregator implements PaymentAggregator{

    @Override
    public void pay(String recipientId, Double amount) {
        System.out.println("Paid Rs. " + amount + " to recipient : " + recipientId + " via in house aggregator");
    }
}
