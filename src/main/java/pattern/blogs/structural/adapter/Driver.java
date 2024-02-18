package pattern.blogs.structural.adapter;

import pattern.blogs.structural.adapter.thirdparty.JusPay;

public class Driver {
    public static void main(String[] args) {
        PaymentAggregator paymentAggregator = new InHouseAggregator();
        paymentAggregator.pay("REC:8989", 45000.00);

        paymentAggregator = new JusPayAdapter(new JusPay());
        paymentAggregator.pay("REC:8989", 45000.00);
    }
}
