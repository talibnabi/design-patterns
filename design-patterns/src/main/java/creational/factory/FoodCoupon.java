package creational.factory;

import java.util.UUID;

public class FoodCoupon implements Coupon {

    @Override
    public String code() {
        return UUID.randomUUID().toString();
    }

    @Override
    public String message() {
        return "I am a food coupon.";
    }
}
