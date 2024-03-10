package pattern.blogs.behavioural.mediator;

public class KYCValidation implements Mediator{
    private final UserAccountVerification userAccountVerification = new UserAccountVerification(this);
    private final UserBasicInfoVerification userBasicInfoVerification = new UserBasicInfoVerification(this);
    private final UserAddressVerification userAddressVerification = new UserAddressVerification(this);
    private final String userId;

    public KYCValidation(String userId) {
        this.userId = userId;
    }

    private boolean isKYCCompleted() {
        return userAccountVerification.isAccountVerified() && userBasicInfoVerification.isVerified() && userAddressVerification.isAddressVerified();
    }

    public void simulateKycVerification() {
        userBasicInfoVerification.verifyUserBasicInfo(userId);
        userAddressVerification.verifyUserAddress(userId);
        userAccountVerification.verifyUserAccount(userId);
    }

    @Override
    public void convey() {
      System.out.println("Is KYC successful ? " + (isKYCCompleted() ? "Yes" : "No"));
    }


}
