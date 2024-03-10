package pattern.blogs.behavioural.mediator;

public class Driver {
    public static void main(String[] args) {
        KYCValidation kycValidation = new KYCValidation("user : WESXAHDU");
        kycValidation.simulateKycVerification();
    }
}
