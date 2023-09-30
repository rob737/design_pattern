package pattern.blogs.behavioural.state;

public class Driver {
    public static void main(String[] args) {
        Coupon coupon = new FrequentUserCoupon();
        CouponContext couponContext = new CouponContext(coupon);

        couponContext.applyDiscount();
    }
}
