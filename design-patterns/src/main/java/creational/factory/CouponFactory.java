package creational.factory;

public class CouponFactory {
    public static Coupon getCoupon(int points) {
        if (points > 50) {
            return new FoodCoupon();
        }
        return new ElectronicsCoupon();
    }
}
