package pattern.blogs.structural.adapter;

import pattern.blogs.structural.adapter.thirdparty.JusPay;

public class JusPayAdapter implements PaymentAggregator{

    private final JusPay jusPay;

    JusPayAdapter(JusPay jusPay){
        this.jusPay = jusPay;
    }

    /*
    * Pre-condition that JusPay mandates is that recipient must have KYC completed before
    * any payment can be initiated.
    * */
    @Override
    public void pay(String recipientId, Double amount) {
        jusPay.validateRecipient(recipientId);
        jusPay.settlePayment(recipientId,amount);
    }
}
