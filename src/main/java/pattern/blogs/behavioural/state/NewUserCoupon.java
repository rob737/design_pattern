package pattern.blogs.behavioural.state;

public class NewUserCoupon extends Coupon{
    @Override
    void apply() {
        System.out.println("New User coupon applied on checkout.");
    }
}
