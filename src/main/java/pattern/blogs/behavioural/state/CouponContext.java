package pattern.blogs.behavioural.state;

// Context : Using Composition, Context class will delegate the call to Coupon abstract class.
// Basically, Context class acts as point of communication for the client program.
public class CouponContext {
    private final Coupon coupon;

    public CouponContext(Coupon coupon) {
        this.coupon = coupon;
    }

    public void applyDiscount(){
        this.coupon.apply();
    }
}
