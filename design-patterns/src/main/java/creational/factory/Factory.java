package creational.factory;

public class Factory {
    // deyek ki bir interface miz var ve ondan implement eden siniflerimiz var,
    // biz istemirik ki classin instance i yarananda sirf oz adiyla yaransin onu gizletmek isteye bilerik
    // .belede factory pattern isledilir.  (Transport--Truck,Sea)
    //factory pattern yaranma detallarin senden gizledir
    public static void main(String[] args) {
        Coupon coupon1 = CouponFactory.getCoupon(30);
        System.out.println(coupon1.message() + "    . " + coupon1.code());
        Coupon coupon2 = CouponFactory.getCoupon(60);
        System.out.println(coupon2.message() + "    . " + coupon2.code());
    }
}
