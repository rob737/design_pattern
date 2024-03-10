package pattern.blogs.behavioural.mediator;

public class UserBasicInfoVerification extends VerificationStep{
    private boolean isVerified = false;

    public UserBasicInfoVerification(Mediator mediator) {
        super(mediator);
    }

    public void verifyUserBasicInfo(String userId){
        System.out.println("Verifying user basic info.");
        this.isVerified = true;
        mediator.convey();
    }

    public boolean isVerified() {
        return isVerified;
    }
}
