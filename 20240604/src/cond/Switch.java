package cond;

public class Switch {
    public static void main(String[] args) {
        int grade = 3;
//        int coupon;

//        if (grade == 1) {
//            coupon = 1000;
//        } else if (grade == 2) {
//            coupon = 2000;
//        } else if (grade == 3) {
//            coupon = 3000;
//        } else {
//            coupon = 500;
//        }
//        System.out.println("coupon = " + coupon);

//        스위치는 같다만 체크 가능
//        switch (grade) {
//            case 1:
//                coupon = 1001;
//                break;
//            case 2:
//                coupon = 2002;
//                break;
//            case 3:
//                coupon = 3003;
//                break;
//            default:
//                coupon = 500;
//
//        }
//        System.out.println("coupon = " + coupon);

//        switch (grade) {
//            case 1:
//                coupon = 1001;
//                break;
//            case 2:
//            case 3:
//                coupon = 3003;
//                break;
//            default:
//                coupon = 500;
//
//        }
//        System.out.println("coupon = " + coupon);

//        new Switch
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        System.out.println("coupon = " + coupon);
    }
}
