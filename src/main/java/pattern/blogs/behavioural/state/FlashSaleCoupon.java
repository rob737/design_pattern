package pattern.blogs.behavioural.state;

public class FlashSaleCoupon extends Coupon{
    @Override
    void apply() {
        System.out.println("Flash Sale Coupon applied on checkout.");
    }
}
