package pattern.blogs.behavioural.mediator;

public class UserAddressVerification extends VerificationStep{
    private boolean isAddressVerified = false;

    public UserAddressVerification(Mediator mediator) {
        super(mediator);
    }

    public void verifyUserAddress(String userId) {
        System.out.println("Verifying user address.");
        this.isAddressVerified = true;
        mediator.convey();
    }


    public boolean isAddressVerified() {
        return isAddressVerified;
    }
}
