package creational.factory;


import java.util.UUID;

public class ElectronicsCoupon implements Coupon {
    @Override
    public String code() {
        return UUID.randomUUID().toString();
    }

    @Override
    public String message() {
        return "I am a electronics coupon.";
    }
}
