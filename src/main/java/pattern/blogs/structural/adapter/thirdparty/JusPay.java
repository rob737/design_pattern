package pattern.blogs.structural.adapter.thirdparty;

public class JusPay {

    public void validateRecipient(String recipientId){
        System.out.println("KYC is already completed for recipient : " + recipientId);
    }

    public void settlePayment(String recipientId, Double amount){
        System.out.println("Juspay settled Rs. " + amount + " with recipient : " + recipientId);
    }

}
