package pattern.blogs.behavioural.state;

public class FrequentUserCoupon extends Coupon{
    @Override
    void apply() {
        System.out.println("Frequent User coupon applied on checkout.");
    }
}
