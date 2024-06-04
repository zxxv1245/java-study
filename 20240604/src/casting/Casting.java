package casting;

public class Casting {
    public static void main(String[] args) {
//        // 형변환
//
//        int intValue = 10;
//        long longValue;
//        double doubleValue;
//        // 자동 형변환
//        longValue = intValue;
//        System.out.println("longValue = " + longValue);
//        doubleValue = intValue;
//        System.out.println("doubleValue = " + doubleValue);
//        doubleValue = 20L;
//        System.out.println("doubleValue = " + doubleValue);

//        double doubleValue = 1.5;
//        int intValue;
//
////        intValue = doubleValue; // 컴파일 오류 발생
//
//        intValue = (int) doubleValue; //명시적 형변환
//        System.out.println("intValue = " + intValue);
//        System.out.println(10.5);
//        System.out.println((int)10.5);

//        long maxIntValue = 2147483647;
//        long maxIntOver = 2147483648L;
////        System.out.println("maxIntOver = " + maxIntOver);
//        int intValue = 0;
//
//        intValue = (int) maxIntValue; // ??? 이해안되게 들어감(개똥같이 들어감) overflow가 발생하지 않게 코드를 작성해야함
//        // overflow가 발생하면 type을 바꿔서 문제 해결하는게 best!
//        System.out.println("maxIntValue casting = " + intValue);
//
//
//        intValue = (int) maxIntOver;
//        System.out.println("maxIntOver casting = " + intValue);
        
        // 계산과 형변환
        int div1 = 3 / 2; // 1.5
        System.out.println("div1 = " + div1); // 1
        
        double div2 = 3 / 2; // 1.5
        System.out.println("div2 = " + div2); // 1.0

        double div3 = 3.0 / 2; // 1.5
        System.out.println("div3 = " + div3); // 1.5
        
        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4); // 1.5
        
        double div5 = 3 / 2.0;
        System.out.println("div5 = " + div5); // 1.5

        // int + int  = int , double + double = double
        // int + double = double
        // int + long = long
        // 다른 타입끼리의 계산은 자동으로 큰 타입으로 계산된다.

    }
    // 작은걸 큰걸로 넣을 때는 자동으로 해주는데
    // 큰걸 작은걸로 넣을 때는 명시적으로 형변환해야함
    
}
