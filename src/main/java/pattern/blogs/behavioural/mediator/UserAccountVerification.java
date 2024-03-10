package pattern.blogs.behavioural.mediator;

public class UserAccountVerification extends VerificationStep {
    private boolean isAccountVerified = false;

    public UserAccountVerification(Mediator mediator) {
        super(mediator);
    }

    public void verifyUserAccount(String userId) {
        System.out.println("Verifying account details submitted by user : " + userId);
        this.isAccountVerified = true;
        mediator.convey();
    }

    public boolean isAccountVerified() {
        return isAccountVerified;
    }
}
